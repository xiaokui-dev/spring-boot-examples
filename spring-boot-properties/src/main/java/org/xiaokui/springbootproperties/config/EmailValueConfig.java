package org.xiaokui.springbootproperties.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author xiaokui
 * @Description:
 * @date 2018-04-24 22:18
 */
@Component
public class EmailValueConfig {

    @Value("${email-name}")
    private String emailName;

    @Value("${email-from}")
    private String emailFrom;

    public String getEmailName() {
        return emailName;
    }

    public String getEmailFrom() {
        return emailFrom;
    }


    @Override
    public String toString() {
        return "EmailValueConfig{" +
                "emailName='" + emailName + '\'' +
                ", emailFrom='" + emailFrom + '\'' +
                '}';
    }
}
