package com.test.controller;

import com.test.bean.entity.Company;
import com.test.service.CompanyService;
import com.test.util.AjaxResponseBody;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    /**
     * 登录接口
     * @return
     */
    @PostMapping(value = "/listAll",consumes = "application/json;charset=UTF-8")
    @ResponseBody
    @ApiOperation(value = "查询公司", notes = "查询公司")
    public AjaxResponseBody listAll() {

        List<Company> list = companyService.listAll();

        return new AjaxResponseBody(HttpStatus.SC_OK,"",list,null);
    }
}
