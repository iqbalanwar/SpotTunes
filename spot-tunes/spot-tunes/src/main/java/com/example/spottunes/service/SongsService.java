package com.example.spottunes.service;

import com.example.spottunes.model.Songs;

import java.sql.Time;

public interface SongsService {

    public Songs addSong(Songs newSong);

    public Iterable<Songs> listSongs();

}
