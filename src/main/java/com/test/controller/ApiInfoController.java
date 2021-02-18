package com.test.controller;

import com.test.bean.entity.ApiInfo;
import com.test.bean.entity.PageEntity;
import com.test.service.ApiInfoService;
import com.test.utils.AjaxResponseBody;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/apiInfo")
@Api(value = "ApiInfoController", description = "接口管理")
public class ApiInfoController {

    @Autowired
    private ApiInfoService apiInfoService;

    /**
     * 查询全部
     * @return
     */
    @PostMapping(value = "/selectAllApiInfo")
    @ResponseBody
    @ApiOperation(value = "查询全部接口by分页", notes = "查询全部接口")
    public AjaxResponseBody selectAllApiInfo(@RequestBody ApiInfo apiInfo) {

        List<ApiInfo> list = apiInfoService.selectAllApiInfo(apiInfo);

        return new AjaxResponseBody(HttpStatus.SC_OK,"",new PageEntity<>(list),null);
    }

    /**
     * 根据id查询
     * @param apiInfo
     * @return
     */
    @PostMapping(value = "/selectApiInfoById")
    @ResponseBody
    @ApiOperation(value = "根据id查询-接口", notes = "根据id查询接口")
    public AjaxResponseBody selectByPrimaryKey(@RequestBody ApiInfo apiInfo){

        ApiInfo reqApiInfo = null;
        if(apiInfo.getId() != null && apiInfo.getId() != 0) {
            reqApiInfo = apiInfoService.selectByPrimaryKey(apiInfo.getId());
        }

        return new AjaxResponseBody(HttpStatus.SC_OK,"",reqApiInfo,null);
    }

    /**
     * 新增-insert
     * @param apiInfo
     * @return
     */
    @PostMapping(value = "/insertApiInfo")
    @ResponseBody
    @ApiOperation(value = "新增接口", notes = "新增接口")
    public AjaxResponseBody insertApiInfo(@RequestBody ApiInfo apiInfo){

        int i = 0;
        if(apiInfo != null) {
            i = apiInfoService.insert(apiInfo);
        }
        return new AjaxResponseBody(HttpStatus.SC_OK,"新增成功",i,null);
    }

    /**
     * 新增-insertSelective
     * @param apiInfo
     * @return
     */
    @PostMapping(value = "/insertSelectiveApiInfo")
    @ResponseBody
    @ApiOperation(value = "新增接口", notes = "新增接口")
    public AjaxResponseBody insertSelectiveApiInfo(@RequestBody ApiInfo apiInfo){

        int i = 0;
        if(apiInfo != null) {
            i = apiInfoService.insertSelective(apiInfo);
        }
        return new AjaxResponseBody(HttpStatus.SC_OK,"新增成功",i,null);
    }

    /**
     * 复制-copySelective by id
     * @param apiInfo
     * @return
     */
    @PostMapping(value = "/copySelectiveApiInfo")
    @ResponseBody
    @ApiOperation(value = "复制接口", notes = "复制接口")
    public AjaxResponseBody copySelectiveApiInfo(@RequestBody ApiInfo apiInfo){
        ApiInfo reqApiInfo = null;
        if(apiInfo.getId() != null && apiInfo.getId() != 0) {
            reqApiInfo = apiInfoService.selectByPrimaryKey(apiInfo.getId());
        }
        reqApiInfo.setId(null);
        reqApiInfo.setApiName(reqApiInfo.getApiName()+"【复制】");
        int i=apiInfoService.insertSelective(reqApiInfo);

        return new AjaxResponseBody(HttpStatus.SC_OK,"复制成功",i,null);
    }

    /**
     * 修改-可选择性
     * @param apiInfo
     * @return
     */
    @PostMapping(value = "/updateApiInfoByPrimaryKeySelective")
    @ResponseBody
    @ApiOperation(value = "修改接口-可选择", notes = "修改接口-可选择")
    public AjaxResponseBody updateApiInfoByPrimaryKeySelective(@RequestBody ApiInfo apiInfo){

        int i = 0;
        if(apiInfo != null) {
            apiInfo.setUpdateTime(new Date());
            i = apiInfoService.updateByPrimaryKeySelective(apiInfo);
        }
        return new AjaxResponseBody(HttpStatus.SC_OK,"修改成功",i,null);
    }

    /**
     * 修改，必传
     * @param apiInfo
     * @return
     */
    @PostMapping(value = "/updateApiInfoByPrimaryKey")
    @ResponseBody
    @ApiOperation(value = "修改接口", notes = "修改接口")
    public AjaxResponseBody updateApiInfoByPrimaryKey(@RequestBody ApiInfo apiInfo){

        int i = 0;
        if(apiInfo != null) {
            apiInfo.setUpdateTime(new Date());
            i = apiInfoService.updateByPrimaryKey(apiInfo);
        }
        return new AjaxResponseBody(HttpStatus.SC_OK,"修改成功",i,null);
    }

    /**
     * 删除
     * @param apiInfo
     * @return
     */
    @PostMapping(value = "/deleteApiInfoByPrimaryKey")
    @ResponseBody
    @ApiOperation(value = "删除接口", notes = "删除接口")
    public AjaxResponseBody deleteApiInfoByPrimaryKey(@RequestBody ApiInfo apiInfo){

        int j = 0;
        if(apiInfo.getId() != null && apiInfo.getId() != 0) {
            apiInfo.setUpdateTime(new Date());
            j = apiInfoService.deleteByPrimaryKey(apiInfo.getId());
        }
        return new AjaxResponseBody(HttpStatus.SC_OK,"删除成功",j,null);
    }
}
