package example.swagger;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * @author xiaokui
 * @Description: Swagger配置类
 * @date 2018-03-30 14:56
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket testApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.xiaokui.springboot.swagger.web"))
                .paths(PathSelectors.ant("/users/**"))
                .build()
                .apiInfo(apiInfo());


    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("Spring Boot REST API")
                .description("测试 REST API")
                .version("1.0")
                .termsOfServiceUrl("Terms of service")
                .contact(new Contact("xiaokui","http://www.xiaokui.org","xiaokui.cui@gmail.com"))
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                .build();

    }

}
