package com.example.spottunes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.spottunes.model.User;
import com.example.spottunes.service.UserService;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public User createUser(@RequestBody User newUser) {
        return userService.createUser(newUser);
    }

    @GetMapping("/login/{username}/{password}")
    public User login(@PathVariable String username, @PathVariable String password){
        return userService.login(username, password);
    }
}