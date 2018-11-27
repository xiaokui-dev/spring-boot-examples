package org.xiaokui.springboot.swagger.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @author xiaokui
 * @Description:Demo测试类
 * @date 2018-03-30 22:07
 */
@RestController
@RequestMapping("/demo")
@Api(value = "/demo", description = "Demo测试")
public class DemoController {


    /**
     * 获取List
     * @return
     */
    @ApiOperation(value = "展现list")
    @RequestMapping(value = "/list", method = RequestMethod.GET,produces = "application/json")
    public List<String> getList() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("你好");
        return list;
    }
}
