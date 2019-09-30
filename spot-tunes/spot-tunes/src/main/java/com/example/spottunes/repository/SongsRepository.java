package com.example.spottunes.repository;

import com.example.spottunes.model.Songs;
import org.springframework.data.repository.CrudRepository;

public interface SongsRepository extends CrudRepository<Songs, Integer> {
}
