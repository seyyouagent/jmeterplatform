package com.test.controller;

import com.test.bean.entity.Company;
import com.test.service.CompanyService;
import com.test.util.AjaxResponseBody;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    /**
     * 查询全部
     * @return
     */
    @PostMapping(value = "/listAll",consumes = "application/json;charset=UTF-8")
    @ResponseBody
    @ApiOperation(value = "查询公司", notes = "查询公司")
    public AjaxResponseBody listAll() {

        List<Company> list = companyService.listAll();

        return new AjaxResponseBody(HttpStatus.SC_OK,"",list,null);
    }

    /**
     * 根据id查询
     * @param object
     * @return
     */
    @PostMapping(value = "/selectByPrimaryKey",consumes = "application/json;charset=UTF-8")
    @ResponseBody
    @ApiOperation(value = "根据id查询", notes = "根据id查询")
    public AjaxResponseBody selectByPrimaryKey(@RequestBody Company object){

        Company company = null;

        if(object.getId() != null && object.getId() != 0) {
            company = companyService.selectByPrimaryKey(object.getId());
        }
        return new AjaxResponseBody(HttpStatus.SC_OK,"",company,null);
    }
}
