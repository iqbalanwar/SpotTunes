package com.example.spottunes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.spottunes.model.User;
import com.example.spottunes.service.UserService;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/signup")
    public User createUser(@RequestBody User newUser) {
        return userService.createUser(newUser);
    }
}