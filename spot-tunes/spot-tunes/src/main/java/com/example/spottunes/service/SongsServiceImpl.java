package com.example.spottunes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.spottunes.model.Songs;
import com.example.spottunes.repository.SongsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Time;
@Service
public class SongsServiceImpl implements SongsService {

    @Autowired
    SongsRepository songsRepository;

    @Autowired
    SongsService songsService;

    @Override
    public Songs addSongToDB(Songs newSong) {
        return songsRepository.save(newSong);
    }

    @Override
    public Iterable<Songs> listSongs() {
        return songsRepository.findAll();
    }
}
