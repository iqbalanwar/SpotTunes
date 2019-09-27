package com.example.spottunes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/signup")
    public String createUser(@RequestBody User newUser) {
        return userService.createUser(newUser);
    }
}