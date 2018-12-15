package example.mybatis.web;

import example.mybatis.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import example.mybatis.service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiaokui
 * @Description:UserController
 * @date 2018-04-02 17:00
 */
@RestController
@RequestMapping(value = "/users")
@Api(value = "/users",description = "注解配置-用户管理")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "用户列表",notes = "查询用户列表")
    @RequestMapping(value = "/list",method = RequestMethod.GET,produces = "application/json")
    public Map<String,Object>  getAll(){
        Map<String,Object> map = new HashMap<>();
        List<User> users = userService.getAll();
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
        int result = userService.add(user);
        map.put("code","0");
        map.put("result",result);
        map.put("message","成功");
        return map;
    }

}
