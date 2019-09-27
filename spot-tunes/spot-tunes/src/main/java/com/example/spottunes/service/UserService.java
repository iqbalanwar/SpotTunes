package com.example.spottunes.service;

public interface UserService {

    public User createUser(User newUser);

    public User login(String username, String password);
}
