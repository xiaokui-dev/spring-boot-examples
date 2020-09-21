package example.actuator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description : Spring Boot 启动类
 *
 * @author : xiaokui
 * @date : 2020-08-14
 */
@SpringBootApplication
@MapperScan(basePackages = "example.actuator.mapper")
public class ActuatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActuatorApplication.class, args);
    }

}
