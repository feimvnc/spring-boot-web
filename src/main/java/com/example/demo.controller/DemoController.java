package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String homePage() {
        return "Home Page!";
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }


}