package com.test.bean.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor                 //无参构造
@AllArgsConstructor                //有参构造
public class ApiInfo  extends  BaseEntity implements Serializable {
    private Integer id;

    private String apiName;

    private String apiType;

    private String apiRequestMethod;

    private String apiUrl;

    private String headers;

    private String params;

    private String files;

    private String verifResponse;

    private String verifResponseStatus;

    private String relationResponseRange;

    private String relationSaveParam;

    private String relationRegularExpression;

    private String relationTemplate;

    private String relationMatchNumber;

    @Builder.Default
    private Integer status=0;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String remark;
}