package me.josephzhu.springsecurity101.cloud.oauth2.userservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("hello")
    public String hello() {
        return "Hello";
    }
}
