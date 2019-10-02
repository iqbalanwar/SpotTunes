package com.example.spottunes.controller;

import com.example.spottunes.model.JwtResponse;
import com.example.spottunes.model.User;
import com.example.spottunes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class WelcomeController {
    @Autowired
    UserService userService;

    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "home";
    }


//
////
////    @PostMapping("/login")
////    public ResponseEntity<?> login(@RequestBody User user) {
////        return ResponseEntity.ok(new JwtResponse(userService.login(user)));
////    }
//
//
//    @PostMapping("/login")
//    public String login(@RequestBody User user, Model model) {
//        return "loginSuccess";
//    }


}