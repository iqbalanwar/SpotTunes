package com.example.spottunes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.spottunes.model.UserRole;
import com.example.spottunes.repository.UserRoleRepository;

@Service
public class UserRoleServiceImpl implements UserRoleService{
    @Autowired
    UserRoleRepository userRoleRepository;

    @Override
    public UserRole createRole(UserRole newRole) {
        return userRoleRepository.save(newRole);
    }

    @Override
    public UserRole getRole(String roleName) {
        return userRoleRepository.findByName(roleName);
    }

    @Override
    public Iterable<UserRole> listRoles() {
        return userRoleRepository.findAll();
    }
}
