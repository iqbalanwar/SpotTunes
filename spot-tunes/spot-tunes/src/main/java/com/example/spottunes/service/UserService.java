package com.example.spottunes.service;
import com.example.spottunes.model.User;


public interface UserService {

    public User createUser(User newUser);

    public User login(String username, String password);
}
