/*
 * Application.java 1.0 2017年9月7日
 *
 * Copyright (c) 1994-1999 Sun Microsystems, Inc. 901 San Antonio Road, Palo Alto, California,
 * 94303, U.S.A. All rights reserved.
 *
 * This software is the confidential and proprietary information of Sun Microsystems, Inc.
 * ("Confidential Information"). You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement you entered into with Sun.
 */
package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description : Spring Boot 启动类
 *
 * @author : xiaokui
 * @date : 2020-08-14
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
