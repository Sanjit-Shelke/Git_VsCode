package com.helloworldservice;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class helloworldservice {

    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }
    
}
