package org.xiaokui.springboot.helloworld.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloWorldController
 */
@RestController // 标注@RestController注解的类不用再使用@Responsebody,也不用在写什么jackjson配置的了！
public class HelloWorldController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello World";
    }

}
