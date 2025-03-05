package com.abhidutta.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping(path = "/new")
    public String getNext() {
        return "Sorry, no new services available.";
    }
}
