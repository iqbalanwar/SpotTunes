package com.example.spottunes.service;

import com.example.spottunes.model.Songs;
import com.example.spottunes.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.sql.Time;

public class UserServiceStub implements UserService {

    @Override
    public User getUser(String username) {
        User user = new User();
        user.setUsername(username);
        return user;
    }

    @Override
    public String createUser(User newUser) {
        return null;
    }

    @Override
    public String login(User user) {
        return null;
    }

    @Override
    public HttpStatus deleteById(Long userId) {
        return null;
    }

    @Override
    public Iterable<Songs> addSongs(String username, int song_id) {
        Songs song = new Songs();

        song.setId(song_id);
        song.setTitle("Baby Back Ribs");
        song.setLength(new Time(163000));

        User user = getUser(username);
        user.addSongs(song);

        return user.getSongs();
    }

    @Override
    public Iterable<Songs> deleteSongFromPlaylist(String username, int song_id) {
        return null;
    }

    @Override
    public Iterable<User> listUsers() {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
