package example.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Description :
 *
 * @author : xiaokui
 * @date : 2018/12/19
 */
@SpringBootTest
public class JdbcApplicationTests {

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
