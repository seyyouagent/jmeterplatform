package com.test.bean.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 公司
 */
@Data
public class Company extends BaseEntity implements Serializable{

    // id
    private Long id;

    // 公司名称
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
}
