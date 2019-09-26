package com.example.spottunes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/helloworld")
    public String helloworld(){
        return "Hello World!";
    }
}