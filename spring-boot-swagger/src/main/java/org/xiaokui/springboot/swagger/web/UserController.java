package org.xiaokui.springboot.swagger.web;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.xiaokui.springboot.swagger.domain.User;
import springfox.documentation.annotations.ApiIgnore;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaokui
 * @Description:
 * @date 2018-03-30 23:19
 */
@RestController
@RequestMapping(value = "/users")
@Api(value = "/users",description = "用户管理")
public class UserController {

    private List<User> list = new ArrayList<>();

    @ApiOperation(value = "用户列表",response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "成功"),
            @ApiResponse(code = 404, message = "找不到")
     }
    )
    @RequestMapping(value = "/list", method= RequestMethod.GET, produces = "application/json")
    public List<User> list(){
        list.add(new User(1L,"test1","test1"));
        list.add(new User(2L,"test2","test2"));
        return list;
    }

    @ApiOperation(value = "根据id查找用户",response = User.class)
    @ApiImplicitParam(name = "ID",value = "用户ID",required = true)
    @RequestMapping(value = "/show/{id}", method= RequestMethod.GET, produces = "application/json")
    public User showUser(@PathVariable Integer id){
        User user = list.get(id);
        return user;
    }

    @ApiOperation(value = "添加用户", notes = "根据User对象创建用户")
    @ApiImplicitParam(name = "user",value = "用户实体",required = true,dataType = "user")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity saveProduct(@RequestBody User user){
        user.setId(3L);
        user.setUserName("test3");
        user.setPassword("test3");
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @ApiOperation(value = "更新用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户ID",required = true),
            @ApiImplicitParam(name = "user",value = "用户实体",required = true,dataType = "user")
    })
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity updateProduct(@PathVariable Integer id, @RequestBody User user){
        User user1 = list.get(id);
        user1.setUserName(user.getUserName());
        user1.setPassword(user.getPassword());
        return new ResponseEntity<>("更新成功", HttpStatus.OK);
    }

    @ApiOperation(value = "删除用户")
    @ApiImplicitParam(name = "id",value = "用户id",required = true)
    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity delete(@PathVariable Integer id){
        list.remove(id);
        return new ResponseEntity<>("删除成功", HttpStatus.OK);
    }

}
