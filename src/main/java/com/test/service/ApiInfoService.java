package com.test.service;

import com.test.bean.entity.ApiInfo;
import com.test.bean.entity.Company;
import com.test.mapper.ApiInfoMapper;
import com.test.mapper.CompanyMapper;
import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiInfoService {

    @Autowired
    ApiInfoMapper apiInfoMapper;

    public int deleteByPrimaryKey(Integer id){ return apiInfoMapper.deleteByPrimaryKey(id);}

    public int insert(ApiInfo apiInfo){ return apiInfoMapper.insert(apiInfo);}

    public int insertSelective(ApiInfo apiInfo){ return apiInfoMapper.insertSelective(apiInfo);}

    public ApiInfo selectByPrimaryKey(Integer id){ return apiInfoMapper.selectByPrimaryKey(id); }

    public List<ApiInfo> selectAllApiInfo(ApiInfo apiInfo){ return apiInfoMapper.selectAllApiInfo(apiInfo);}

    public int updateByPrimaryKeySelective(ApiInfo apiInfo){ return apiInfoMapper.updateByPrimaryKeySelective(apiInfo);}

    public int updateByPrimaryKey(ApiInfo apiInfo){ return apiInfoMapper.updateByPrimaryKey(apiInfo);}
}
