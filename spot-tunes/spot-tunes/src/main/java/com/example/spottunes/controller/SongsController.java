package com.example.spottunes.controller;

import com.example.spottunes.model.Songs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongsController {
    @Autowired
    SongsService songsService;

    // Endpoint adds a song to the table
    @PostMapping("/add")
    public Songs addSong(@RequestBody Song newSong) {
        return songsService.addSong(newSong);
    }

    // This lists all the songs found in the table
    @GetMapping("/list")
    public Iterable<Songs> listSings() {
        return songsService.listSongs();
    }
}

