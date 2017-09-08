package com.data.mapper;

import com.data.pojo.CmsRoleResourceRelCriteria;
import com.data.pojo.CmsRoleResourceRelKey;
import java.util.List;
import org.apache.ibatis.session.RowBounds;

public interface CmsRoleResourceRelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_resource_rel
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(CmsRoleResourceRelKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_resource_rel
     *
     * @mbg.generated
     */
    int insert(CmsRoleResourceRelKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_resource_rel
     *
     * @mbg.generated
     */
    int insertSelective(CmsRoleResourceRelKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_resource_rel
     *
     * @mbg.generated
     */
    List<CmsRoleResourceRelKey> selectByExampleWithRowbounds(CmsRoleResourceRelCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_role_resource_rel
     *
     * @mbg.generated
     */
    List<CmsRoleResourceRelKey> selectByExample(CmsRoleResourceRelCriteria example);
}