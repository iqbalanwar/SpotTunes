package com.example.spottunes.service;

import com.example.spottunes.model.UserRole;

public interface UserRoleService {
    public UserRole createRole(UserRole newRole);

    public UserRole getRole(String roleName);
}
