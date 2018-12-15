package example.jpa.service;

import example.jpa.Application;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import example.jpa.domain.User;

import java.util.Optional;

/**
 * @author xiaokui
 * @Description:Service测试类
 * @date 2018-04-17 16:56
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void findUserTest(){
        Optional<User> user = userService.findUserById(1L);

        Assert.assertThat(user.get().getUserName(), CoreMatchers.is("string"));
    }
}
