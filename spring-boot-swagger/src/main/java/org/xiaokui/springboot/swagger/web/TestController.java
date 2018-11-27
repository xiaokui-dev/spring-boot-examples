package org.xiaokui.springboot.swagger.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaokui
 * @Description:Test
 * @date 2018-03-30 23:09
 */
@RestController
@RequestMapping(value = "/test")
@Api(value = "/test",description = "test测试")
public class TestController {

    @ApiOperation(value = "/展现test")
    @ApiImplicitParam(name = "name",required = true,value = "姓名")
    @RequestMapping(value = "/show",method = RequestMethod.GET,produces = "application/json")
    public String show(@RequestParam("name") String name){
        return "success";
    }
}
