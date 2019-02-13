package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @RequestMapping("/home")
    String home() {
        return "Hello World!";
    }
}
