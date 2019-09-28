package com.example.spottunes.service;

import com.example.spottunes.model.UserRole;
import com.example.spottunes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.spottunes.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    UserRoleService userRoleService;

    @Override
    public User createUser(User newUser) {
        UserRole userRole = userRoleService.getRole(newUser.getUserRole().getName());
        newUser.setUserRole(userRole);
        return userRepository.save(newUser);
    }
    public User login(String username, String password) {
        return userRepository.login(username, password);
    }
}
