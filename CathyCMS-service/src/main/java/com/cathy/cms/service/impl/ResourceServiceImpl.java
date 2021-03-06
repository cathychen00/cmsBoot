package com.cathy.cms.service.impl;

import cms.cathy.common.utils.ConstantHelper;
import com.cathy.cms.service.ResourceService;
import com.data.mapper.CmsResourceMapper;
import com.data.model.ResourceItem;
import com.data.pojo.CmsResource;
import com.data.pojo.CmsResourceCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by 陈敬 on 17/9/8.
 */
@Service
public class ResourceServiceImpl implements ResourceService {
    @Autowired
    CmsResourceMapper resourceMapper;

    @Override
    public Set<CmsResource> findByRoleId(Integer roleId) {
        return resourceMapper.findByRoleId(roleId);
    }

    @Override
    public List<CmsResource> listAllResources() {
        CmsResourceCriteria criteria = new CmsResourceCriteria();
        criteria.setOrderByClause(" order_no ");
        return resourceMapper.selectByExample(criteria);
    }

    @Override
    public List<CmsResource> listResourcesByType(String type) {
        CmsResourceCriteria criteria = new CmsResourceCriteria();
        criteria.createCriteria().andTypeEqualTo(type);

        return resourceMapper.selectByExample(criteria);
    }

    @Override
    public List<ResourceItem> findAllMenu() {
        List<CmsResource> allResources = listAllResources();
        List<ResourceItem> resourceWrappers = new ArrayList<ResourceItem>();
        Map<Integer, ResourceItem> map = new HashMap<Integer, ResourceItem>();

        for (final CmsResource resource : allResources) {
            if (resource.getDeleteFlag() == "1") {
                continue;
            }

            ResourceItem item = new ResourceItem() {{
                setCurrentResource(resource);
            }};
            resourceWrappers.add(item);
            map.put(resource.getResourceId(), item);
        }

        List<ResourceItem> menus = new ArrayList<ResourceItem>();
        if (resourceWrappers != null && !resourceWrappers.isEmpty()) {

            for (final ResourceItem wrapper : resourceWrappers) {
                CmsResource resource = wrapper.getCurrentResource();
                if (resource.getParentId() == null || resource.getParentId() == 0) {
                    menus.add(wrapper);
                } else {
                    ResourceItem parentResource = map.get(wrapper.getCurrentResource().getParentId());
                    if (parentResource == null) {
                        menus.add(wrapper);
                    } else {
                        if (parentResource.getChildren() == null) {
                            parentResource.setChildren(new ArrayList<ResourceItem>());
                        }
                        parentResource.getChildren().add(wrapper);
                    }
                }
            }
        }

        return menus;
    }

    @Override
    public List<CmsResource> findByUserId(int userId) {
        return resourceMapper.findByUserId(userId);
    }

    @Override
    public Set<Integer> findResourceIdsByUserId(int userId) {
        List<CmsResource> resources = findByUserId(userId);
        if (resources == null || resources.isEmpty()) {
            return null;
        }

        Set<Integer> ids = new HashSet<Integer>();
        for (CmsResource resource : resources) {
            ids.add(resource.getResourceId());
        }
        return ids;
    }

    @Override
    public CmsResource findByResourceId(Integer resourceId) {
        return resourceMapper.selectByPrimaryKey(resourceId);
    }

    @Override
    public void insertResource(CmsResource resource) {
        resource.setCreateDate(new Date());
        resource.setDeleteFlag(ConstantHelper.DELETE_FLAG_NORMAL);
        resourceMapper.insert(resource);
    }

    @Override
    public void updateResource(CmsResource resource) {
        CmsResource oldResource = resourceMapper.selectByPrimaryKey(resource.getResourceId());

        oldResource.setUpdateDate(new Date());
        oldResource.setResourceName(resource.getResourceName());
        oldResource.setUrl(resource.getUrl());
        oldResource.setIcon(resource.getIcon());
        oldResource.setType(resource.getType());
        oldResource.setParentId(resource.getParentId());
        oldResource.setOrderNo(resource.getOrderNo());

        resourceMapper.updateByPrimaryKey(oldResource);
    }

    @Override
    public void deleteResource(int id) {
        CmsResource resource = resourceMapper.selectByPrimaryKey(id);
        if (resource == null) {
            return;
        }

        resource.setDeleteFlag(ConstantHelper.DELETE_FLAG_DELETED);
        resource.setUpdateDate(new Date());
        resourceMapper.updateByPrimaryKey(resource);
    }

    @Override
    public void resetResource(int id) {
        CmsResource resource = resourceMapper.selectByPrimaryKey(id);
        resource.setUpdateDate(new Date());
        if (resource == null) {
            return;
        }

        resource.setDeleteFlag(ConstantHelper.DELETE_FLAG_NORMAL);
        resourceMapper.updateByPrimaryKey(resource);
    }

    @Override
    public List<Map<String, Object>> getTreeMap() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        //根节点
        Map<String, Object> root = new HashMap<String, Object>();
        root.put("id", 0);
        root.put("name", "root");
        root.put("pId", -1);
        root.put("open", true);
        list.add(root);

        //全部资源
        List<CmsResource> resources = listAllResources();
        if (resources != null && !resources.isEmpty()) {
            for (CmsResource r : resources) {
                if (r.getDeleteFlag().equals(ConstantHelper.DELETE_FLAG_NORMAL)) {
                    Map<String, Object> map = new HashMap<String, Object>();
                    map.put("id", r.getResourceId());
                    map.put("name", r.getResourceName());
                    Integer pId=0;
                    if(r.getParentId()!=null&&r.getParentId()>0){
                        pId=r.getParentId();
                    }
                    map.put("pId", pId);

                    list.add(map);
                }
            }
        }

        return list;
    }
}
