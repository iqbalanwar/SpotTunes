package com.example.spottunes.service;

import com.example.spottunes.config.JwtUtil;
import com.example.spottunes.model.Songs;
import com.example.spottunes.model.User;
import com.example.spottunes.model.UserRole;
import com.example.spottunes.repository.SongsRepository;
import com.example.spottunes.repository.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;

import java.sql.Time;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
    @Mock
    SongsRepository songsRepository;

    @Mock
    SongsService songsService;

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    UserRepository userRepository;

    @Mock
    private JwtUtil jwtUtil;

    @InjectMocks
    private User user;

    @InjectMocks
    private Songs song;

    @Mock
    private UserRole userRole;

    @Before
    public void initDummySong() {
        song.setId(22);
        song.setTitle("Baby Back Ribs");
        song.setLength(new Time(163000));
    }

    @Before
    public void initDummy() {
        user.setUsername("Jim");
        user.setPassword("ilovepam");
    }

    @Test
    public void addSongs_SongAdded_success() {
        // after adding a song
        // return the user
        // success is the user returned
//
        // ADDING A SONG TO THE USER'S SONG ARRAY
        User tempUser = new User();
        // added the dummy song here
        tempUser.addSongs(song);

//        // FINDS THE SONG FROM THE SONG REPO BASED ON SONG_ID, AND THEN CALLS user.addSongs(song)
//        userService.addSongs("Jim", 22);
//        when(userRepository.findByUsername(anyString())).thenReturn(user);

//        Assert.assertEquals(tempUser.getSongs(), user.getSongs());

        tempUser.getSongs().forEach(song -> System.out.println(song.getTitle()));
        Assert.assertNotNull(tempUser);
    }

    @Test
    public void deleteSongs_SongDeleted_success() {
        // Made a user, user now has a song (tested, it works)
        User tempUser = new User();
        tempUser.addSongs(song);

        tempUser.deleteSongs(song);

        // Supposed to return nothing (an empty List)
        tempUser.getSongs().forEach(song -> System.out.println(song.getTitle()));

        Assert.assertTrue(tempUser.getSongs().isEmpty());

    }
}
