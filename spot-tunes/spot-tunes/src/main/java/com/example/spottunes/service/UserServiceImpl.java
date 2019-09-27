package com.example.spottunes.service;

import com.example.spottunes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.spottunes.model.User;

public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    public User createUser(User newUser) {
        return userRepository.save(newUser);
    }

    public User login(String username, String password) {
        return userRepository.login(username, password);
    }
}
