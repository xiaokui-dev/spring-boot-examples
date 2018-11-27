package org.xiaokui.springboot.jdbc.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import javax.sql.DataSource;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author xiaokui
 * @Description:数据源配置类
 * @date 2018-04-23 17:26
 */
@SpringBootConfiguration
public class DataSourceConfig {

    @Primary
    @Bean
    @ConfigurationProperties("spring.datasource.druid.one")
    public DataSource dataSourceOne(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.druid.two")
    public DataSource dataSourceTwo(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    public JdbcTemplate jdbcTemplateOne(){
        return new JdbcTemplate(dataSourceOne());
    }

    @Bean
    public JdbcTemplate jdbcTemplateTwo(){
        return new JdbcTemplate(dataSourceTwo());
    }
}
