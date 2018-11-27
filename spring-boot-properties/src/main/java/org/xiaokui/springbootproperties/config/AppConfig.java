package org.xiaokui.springbootproperties.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author xiaokui
 * @Description:
 * @date 2018-04-24 22:12
 */
@Component
@ConfigurationProperties("app")
public class AppConfig {

    private String name;

    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "AppConfig{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
