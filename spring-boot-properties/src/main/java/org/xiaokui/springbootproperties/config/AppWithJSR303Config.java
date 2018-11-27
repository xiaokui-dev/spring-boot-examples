package org.xiaokui.springbootproperties.config;

import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author xiaokui
 * @Description:
 * @date 2018-04-24 22:13
 */
@Component
@ConfigurationProperties("app")
public class AppWithJSR303Config {

    @NotNull
    private String name;

    @NotBlank
    @Length(min = 1, max = 100)
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
        return "AppWithJSR303Config{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
