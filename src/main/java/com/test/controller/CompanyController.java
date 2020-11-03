package com.test.controller;

import com.test.bean.entity.Company;
import com.test.service.CompanyService;
import com.test.util.AjaxResponseBody;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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

    /**
     * 新增
     * @param company
     * @return
     */
    @PostMapping(value = "/insert",consumes = "application/json;charset=UTF-8")
    @ResponseBody
    @ApiOperation(value = "新增", notes = "新增")
    public AjaxResponseBody insert(@RequestBody Company company){

        int i = 0;
        if(company != null) {
            company.setUpdateTime(new Date());
            i = companyService.insert(company);
        }
        return new AjaxResponseBody(HttpStatus.SC_OK,"新增成功",i,null);
    }

    /**
     * 修改
     * @param company
     * @return
     */
    @PostMapping(value = "/updateByPrimaryKeySelective",consumes = "application/json;charset=UTF-8")
    @ResponseBody
    @ApiOperation(value = "修改", notes = "修改")
    public AjaxResponseBody updateByPrimaryKeySelective(@RequestBody Company company){

        int i = 0;
        if(company != null) {
            company.setUpdateTime(new Date());
            i = companyService.updateByPrimaryKeySelective(company);
        }
        return new AjaxResponseBody(HttpStatus.SC_OK,"修改成功",i,null);
    }

    /**
     * 删除
     * @param company
     * @return
     */
    @PostMapping(value = "/deleteByPrimaryKey",consumes = "application/json;charset=UTF-8")
    @ResponseBody
    @ApiOperation(value = "删除", notes = "删除")
    public AjaxResponseBody deleteByPrimaryKey(@RequestBody Company company){

        int i = 0;
        if(company.getId() != null && company.getId() != 0) {
            company.setUpdateTime(new Date());
            i = companyService.deleteByPrimaryKey(company.getId());
        }
        return new AjaxResponseBody(HttpStatus.SC_OK,"删除成功",i,null);
    }
}
