package com.helloworldservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworldservice {

    @GetMapping(path = "/hello-world")
	public String helloWorld()
	{
		return "Hello World!";
	}
}
