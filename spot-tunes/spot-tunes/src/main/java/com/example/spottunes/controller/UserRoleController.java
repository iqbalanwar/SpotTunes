package com.example.spottunes.controller;

import com.example.spottunes.model.UserRole;
import com.example.spottunes.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class UserRoleController {

    @Autowired
    UserRoleService roleService;

    @GetMapping("/list")
    public Iterable<UserRole> listRoles() {
        return roleService.listRoles();
    }

    @PostMapping
    public UserRole createRole(@RequestBody UserRole role) {
        return roleService.createRole(role);
    }

}