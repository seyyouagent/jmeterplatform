package com.test.service;

import com.test.entity.Company;
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
}
