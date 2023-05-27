package com.learnjava.module_2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// http://localhost:8080/hello?名=值&名=值
@Controller //注解
public class HelloController { //控制器
    @RequestMapping("/hello")
    @ResponseBody
    String hi(String name) {
        return "hello, " + name;
    }

    @RequestMapping("/bye")
    @ResponseBody
    String bye() {
        return "Bye Bye!";
    }
}
