package example.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description : Controller
 *
 * @author : xiaokui
 * @date : 2020-08-14
 */
@RestController
public class HelloWorldController {

    @GetMapping(value = "/hello")
    public String helloWorld() {
        return "Hello World";
    }

}
