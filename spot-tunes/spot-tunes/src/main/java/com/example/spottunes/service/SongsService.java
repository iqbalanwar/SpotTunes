package com.example.spottunes.service;

import com.example.spottunes.model.Songs;

import java.sql.Time;

public interface SongsService {

    public Songs addSongToDB(Songs newSong);

    public Iterable<Songs> listSongs();

}
