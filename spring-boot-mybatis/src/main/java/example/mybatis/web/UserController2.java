package example.mybatis.web;

import example.mybatis.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import example.mybatis.service.UserService;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaokui
 * @Description:用户管理xml配置Controller
 * @date 2018-04-03 14:47
 */
@RestController
@RequestMapping(value = "/users2")
@Api(value = "/users2",description = "XML配置-用户管理2")
public class UserController2 {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询用户",notes = "根据id查询用户")
    @ApiImplicitParam(name = "id",value = "用户id",required = true)
    @RequestMapping(value = "/show/{id}",method = RequestMethod.GET,produces = "application/json")
    public Map<String,Object> findByUserId(@PathVariable("id") Long id){
        Map<String,Object> map = new HashMap<>();
        User user = userService.findUserById(id);
        map.put("code","0");
        map.put("result",user);
        map.put("message","成功");
        return map;
    }
}
