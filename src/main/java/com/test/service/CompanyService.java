package com.test.service;

import com.test.bean.entity.Company;
import com.test.mapper.CompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    CompanyMapper companyMapper;

    public List<Company> listAll(){
        return companyMapper.listAll();
    }

    public Company selectByPrimaryKey(Long id) {
        return companyMapper.selectByPrimaryKey(id);
    }

    public int insert(Company company){

        return companyMapper.insert(company);
    }

    public int updateByPrimaryKeySelective(Company company) {
        return companyMapper.updateByPrimaryKeySelective(company);
    }

    public int deleteByPrimaryKey(Long id) {

        return companyMapper.deleteByPrimaryKey(id);
    }
}
