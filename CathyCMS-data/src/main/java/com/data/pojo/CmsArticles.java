package com.data.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class CmsArticles implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_articles.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_articles.channel1
     *
     * @mbg.generated
     */
    private Integer channel1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_articles.channel2
     *
     * @mbg.generated
     */
    private Integer channel2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_articles.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_articles.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_articles.publish_time
     *
     * @mbg.generated
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date publishTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_articles.cover_image_url
     *
     * @mbg.generated
     */
    private String coverImageUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_articles.publisher
     *
     * @mbg.generated
     */
    private String publisher;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_articles.admin_id
     *
     * @mbg.generated
     */
    private Integer adminId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_articles.admin_name
     *
     * @mbg.generated
     */
    private String adminName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_articles.summary
     *
     * @mbg.generated
     */
    private String summary;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_articles.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_articles.is_audit
     *
     * @mbg.generated
     */
    private Boolean isAudit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_articles.is_top
     *
     * @mbg.generated
     */
    private Boolean isTop;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_articles.is_delete
     *
     * @mbg.generated
     */
    private Boolean isDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_articles.pc_pv
     *
     * @mbg.generated
     */
    private Integer pcPv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_articles.is_draft
     *
     * @mbg.generated
     */
    private Boolean isDraft;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_articles.cover_image
     *
     * @mbg.generated
     */
    private String coverImage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_articles.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cms_articles
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_articles.id
     *
     * @return the value of cms_articles.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_articles.id
     *
     * @param id the value for cms_articles.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_articles.channel1
     *
     * @return the value of cms_articles.channel1
     *
     * @mbg.generated
     */
    public Integer getChannel1() {
        return channel1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_articles.channel1
     *
     * @param channel1 the value for cms_articles.channel1
     *
     * @mbg.generated
     */
    public void setChannel1(Integer channel1) {
        this.channel1 = channel1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_articles.channel2
     *
     * @return the value of cms_articles.channel2
     *
     * @mbg.generated
     */
    public Integer getChannel2() {
        return channel2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_articles.channel2
     *
     * @param channel2 the value for cms_articles.channel2
     *
     * @mbg.generated
     */
    public void setChannel2(Integer channel2) {
        this.channel2 = channel2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_articles.create_time
     *
     * @return the value of cms_articles.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_articles.create_time
     *
     * @param createTime the value for cms_articles.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_articles.update_time
     *
     * @return the value of cms_articles.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_articles.update_time
     *
     * @param updateTime the value for cms_articles.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_articles.publish_time
     *
     * @return the value of cms_articles.publish_time
     *
     * @mbg.generated
     */
    public Date getPublishTime() {
        return publishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_articles.publish_time
     *
     * @param publishTime the value for cms_articles.publish_time
     *
     * @mbg.generated
     */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_articles.cover_image_url
     *
     * @return the value of cms_articles.cover_image_url
     *
     * @mbg.generated
     */
    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_articles.cover_image_url
     *
     * @param coverImageUrl the value for cms_articles.cover_image_url
     *
     * @mbg.generated
     */
    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl == null ? null : coverImageUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_articles.publisher
     *
     * @return the value of cms_articles.publisher
     *
     * @mbg.generated
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_articles.publisher
     *
     * @param publisher the value for cms_articles.publisher
     *
     * @mbg.generated
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_articles.admin_id
     *
     * @return the value of cms_articles.admin_id
     *
     * @mbg.generated
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_articles.admin_id
     *
     * @param adminId the value for cms_articles.admin_id
     *
     * @mbg.generated
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_articles.admin_name
     *
     * @return the value of cms_articles.admin_name
     *
     * @mbg.generated
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_articles.admin_name
     *
     * @param adminName the value for cms_articles.admin_name
     *
     * @mbg.generated
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_articles.summary
     *
     * @return the value of cms_articles.summary
     *
     * @mbg.generated
     */
    public String getSummary() {
        return summary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_articles.summary
     *
     * @param summary the value for cms_articles.summary
     *
     * @mbg.generated
     */
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_articles.title
     *
     * @return the value of cms_articles.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_articles.title
     *
     * @param title the value for cms_articles.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_articles.is_audit
     *
     * @return the value of cms_articles.is_audit
     *
     * @mbg.generated
     */
    public Boolean getIsAudit() {
        return isAudit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_articles.is_audit
     *
     * @param isAudit the value for cms_articles.is_audit
     *
     * @mbg.generated
     */
    public void setIsAudit(Boolean isAudit) {
        this.isAudit = isAudit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_articles.is_top
     *
     * @return the value of cms_articles.is_top
     *
     * @mbg.generated
     */
    public Boolean getIsTop() {
        return isTop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_articles.is_top
     *
     * @param isTop the value for cms_articles.is_top
     *
     * @mbg.generated
     */
    public void setIsTop(Boolean isTop) {
        this.isTop = isTop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_articles.is_delete
     *
     * @return the value of cms_articles.is_delete
     *
     * @mbg.generated
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_articles.is_delete
     *
     * @param isDelete the value for cms_articles.is_delete
     *
     * @mbg.generated
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_articles.pc_pv
     *
     * @return the value of cms_articles.pc_pv
     *
     * @mbg.generated
     */
    public Integer getPcPv() {
        return pcPv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_articles.pc_pv
     *
     * @param pcPv the value for cms_articles.pc_pv
     *
     * @mbg.generated
     */
    public void setPcPv(Integer pcPv) {
        this.pcPv = pcPv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_articles.is_draft
     *
     * @return the value of cms_articles.is_draft
     *
     * @mbg.generated
     */
    public Boolean getIsDraft() {
        return isDraft;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_articles.is_draft
     *
     * @param isDraft the value for cms_articles.is_draft
     *
     * @mbg.generated
     */
    public void setIsDraft(Boolean isDraft) {
        this.isDraft = isDraft;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_articles.cover_image
     *
     * @return the value of cms_articles.cover_image
     *
     * @mbg.generated
     */
    public String getCoverImage() {
        return coverImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_articles.cover_image
     *
     * @param coverImage the value for cms_articles.cover_image
     *
     * @mbg.generated
     */
    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage == null ? null : coverImage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_articles.content
     *
     * @return the value of cms_articles.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_articles.content
     *
     * @param content the value for cms_articles.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_articles
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", channel1=").append(channel1);
        sb.append(", channel2=").append(channel2);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", publishTime=").append(publishTime);
        sb.append(", coverImageUrl=").append(coverImageUrl);
        sb.append(", publisher=").append(publisher);
        sb.append(", adminId=").append(adminId);
        sb.append(", adminName=").append(adminName);
        sb.append(", summary=").append(summary);
        sb.append(", title=").append(title);
        sb.append(", isAudit=").append(isAudit);
        sb.append(", isTop=").append(isTop);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", pcPv=").append(pcPv);
        sb.append(", isDraft=").append(isDraft);
        sb.append(", coverImage=").append(coverImage);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }
}