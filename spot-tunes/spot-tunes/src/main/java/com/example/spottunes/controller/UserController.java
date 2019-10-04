package com.example.spottunes.controller;

import com.example.spottunes.config.JwtUtil;
import com.example.spottunes.model.JwtResponse;
import com.example.spottunes.model.Songs;
import com.example.spottunes.model.User;
import com.example.spottunes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/get/{username}")
    public String getUsername(@PathVariable String username){
        return userService.getUser(username).getUsername();
    }


    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        return ResponseEntity.ok(new JwtResponse(userService.login(user)));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> createUser(@RequestBody User newUser) {
        return ResponseEntity.ok(new JwtResponse(userService.createUser(newUser)));
    }

    @DeleteMapping("/user/{userId}")
    public HttpStatus deleteUserById(@PathVariable Long userId) {
        return userService.deleteById(userId);
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!!";
    }


    @PutMapping("/user/{username}/add/{song_id}")
    public Iterable<Songs> addSong(@PathVariable String username, @PathVariable int song_id) {
        return userService.addSongsToPlaylist(username, song_id);
    }

    @DeleteMapping("/user/{username}/delete/{song_id}")
    public Iterable<Songs> deleteSongFromPlaylist(@PathVariable String username, @PathVariable int song_id) {
        return userService.deleteSongFromPlaylist(username, song_id);
    }

    @GetMapping("/user/list")
    public Iterable<User> listUsers() {
        return userService.listUsers();
    }
}