package com.example.spottunes.controller;

import com.example.spottunes.config.JwtUtil;
import com.example.spottunes.service.SongsService;
import com.example.spottunes.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
public class SongControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SongsService songsService;

    // this JSON security mock bean is here because we are testing how it handles our requests
    @MockBean
    private JwtUtil jwtUtil;

    
}
