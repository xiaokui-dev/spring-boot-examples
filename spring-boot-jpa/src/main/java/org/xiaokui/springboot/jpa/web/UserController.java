package org.xiaokui.springboot.jpa.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.xiaokui.springboot.jpa.domain.User;
import org.xiaokui.springboot.jpa.service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiaokui
 * @Description:UserController
 * @date 2018-04-09 18:54
 */
@RestController
@RequestMapping(value = "/users")
@Api(value = "/users",description = "用户管理")
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @ApiOperation(value = "用户列表",notes = "查询用户列表")
    @RequestMapping(value = "/list",method = RequestMethod.GET,produces = "application/json")
    public Map<String,Object>  getAll(){
        logger.debug("查询用户列表");
        Map<String,Object> map = new HashMap<>();
        Iterable<User> users = userService.findAll();
        map.put("code","0");
        map.put("result",users);
        map.put("message","成功");
        return map;
    }

    @ApiOperation(value = "添加用户",notes = "根据Users对象添加用户")
    @ApiImplicitParam(name = "user",value = "用户实体",required = true,dataType = "user")
    @RequestMapping(value = "/add",method = RequestMethod.POST,produces = "application/json")
    public Map<String,Object> saveUser(@RequestBody User user){
        Map<String,Object> map = new HashMap<>();
        userService.saveUser(user);
        map.put("code","0");
        map.put("message","成功");
        return map;
    }
}
