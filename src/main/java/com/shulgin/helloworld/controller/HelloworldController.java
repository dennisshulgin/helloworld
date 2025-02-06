package com.shulgin.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloworldController {



    @GetMapping("/")
    public String hello() {
        return "Hello, Denis";
    }
}
