package org.xiaokui.springboot.mybatis;

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

/**
 * @author xiaokui
 * @Description:Swagger配置类
 * @date 2018-04-02 17:25
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    @Bean
    public Docket testApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.xiaokui.springboot.mybatis.web"))
                .paths(PathSelectors.any())
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
