package com.market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorld {
    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello World, this is an app build with Spring";
    }
}
