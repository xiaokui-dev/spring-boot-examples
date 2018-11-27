package org.xiaokui.springbootproperties.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author xiaokui
 * @Description:
 * @date 2018-04-24 22:18
 */
@Component
@ConfigurationProperties
public class EmailConfig {

    private String emailName;

    private String emailFrom;

    public String getEmailName() {
        return emailName;
    }

    public void setEmailName(String emailName) {
        this.emailName = emailName;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }


    @Override
    public String toString() {
        return "EmailConfig{" +
                "emailName='" + emailName + '\'' +
                ", emailFrom='" + emailFrom + '\'' +
                '}';
    }
}
