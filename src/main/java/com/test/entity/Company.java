package com.test.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 公司
 */
public class Company implements Serializable {

    private Long id;

    private String aliasName;

    private String companyName;

    private String hierarchy;

    private String level;

    private Long parentId;

    private Long status;

    private Long serial;

    private Long usedFlag;

    private Date createTime;

    private Long createUserId;

    private Date updateTime;

    private Long updateUserId;

    private String descn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getHierarchy() {
        return hierarchy;
    }

    public void setHierarchy(String hierarchy) {
        this.hierarchy = hierarchy;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getSerial() {
        return serial;
    }

    public void setSerial(Long serial) {
        this.serial = serial;
    }

    public Long getUsedFlag() {
        return usedFlag;
    }

    public void setUsedFlag(Long usedFlag) {
        this.usedFlag = usedFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getDescn() {
        return descn;
    }

    public void setDescn(String descn) {
        this.descn = descn;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", aliasName='" + aliasName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", hierarchy='" + hierarchy + '\'' +
                ", level='" + level + '\'' +
                ", parentId=" + parentId +
                ", status=" + status +
                ", serial=" + serial +
                ", usedFlag=" + usedFlag +
                ", createTime=" + createTime +
                ", createUserId=" + createUserId +
                ", updateTime=" + updateTime +
                ", updateUserId=" + updateUserId +
                ", descn='" + descn + '\'' +
                '}';
    }
}
