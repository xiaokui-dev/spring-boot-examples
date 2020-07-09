package example.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description : 数据源配置类
 *
 * @author : xiaokui
 * @date : 2018-04-23 17:26
 */
@SpringBootApplication
public class JdbcApplication {

    public static void main(String[] args){
        SpringApplication.run(JdbcApplication.class,args);
    }
}
