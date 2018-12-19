package example.jpa;

import example.jpa.domain.User;
import example.jpa.service.UserService;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * Description :
 *
 * @author : xiaokui
 * @date : 2018/12/19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaApplicationTests {

    @Autowired
    private UserService userService;


    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;


    @Test
    public void findUserTest(){
        Optional<User> user = userService.findUserById(1L);

        Assert.assertThat(user.get().getUserName(), CoreMatchers.is("string"));
    }


    @Before
    public void setupMockMvc(){
        //初始化 MockMvc 对象
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void findUser() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/users/list")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept(MediaType.APPLICATION_JSON_UTF8)
        )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    @Transactional
    @Rollback(false)
    public void saveUser() throws Exception{
        String json = "{\"gmtCreate\": \"2018-04-17T19:48:03.113Z\", \"userDescription\": \"测试回滚\", \"userName\": \"测试回滚\", \"userPassword\": \"1111111\"}";
        mockMvc.perform(MockMvcRequestBuilders.post("/users/add")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept(MediaType.APPLICATION_JSON_UTF8).content(json))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }
}
