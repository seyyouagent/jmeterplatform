package com.test.mapper;

import com.test.bean.entity.Company;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface CompanyMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Company company);

    Company selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Company company);

    List<Company> listAll(Company company);
}
