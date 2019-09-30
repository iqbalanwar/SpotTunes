package com.example.spottunes.service;
import com.example.spottunes.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService {

    public User getUser(String username);

    public String createUser(User newUser);

    public String login(User user);

    public HttpStatus deleteById(Long userId);

    public User addSong(String username, int song_id);

}
