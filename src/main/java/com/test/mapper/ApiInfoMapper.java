package com.test.mapper;

import com.test.bean.entity.ApiInfo;

import java.util.List;

public interface ApiInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ApiInfo record);

    int insertSelective(ApiInfo apiInfo);

    ApiInfo selectByPrimaryKey(Integer id);

    List<ApiInfo> selectAllApiInfo(ApiInfo apiInfo);

    int updateByPrimaryKeySelective(ApiInfo apiInfo);

    int updateByPrimaryKey(ApiInfo apiInfo);
}