package org.xiaokui.springboot.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.xiaokui.springboot.jdbc.SpringBootJdbcApplication;

/**
 * @author xiaokui
 * @Description:
 * @date 2018-04-23 20:13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplateOne;

    @Autowired
    private JdbcTemplate jdbcTemplateTwo;

    @Test
    public void test1(){
        jdbcTemplateTwo.execute("DELETE from t_user");
        jdbcTemplateOne.execute("INSERT INTO t_city ( city_name, state) VALUES ('邯郸2', 3)");
    }
}
