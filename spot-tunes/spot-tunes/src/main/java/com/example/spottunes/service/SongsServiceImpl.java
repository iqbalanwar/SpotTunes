package com.example.spottunes.service;

import com.example.spottunes.model.Songs;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Time;

public class SongsServiceImpl implements SongsService {

    @Autowired
    SongsRespository songsRepository;

    @Autowired
    SongsService songsService;

    @Override
    public Songs addSong(Songs newSong) {
        return songsRepository.save(newSong);
    }

    @Override
    public Iterable<Songs> listSongs() {
        return songsRepository.findAll();
    }
}
