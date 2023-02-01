package com.example.musicapp.service;

import com.example.musicapp.model.Song;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ISongService {
    void save(Song song);
    void update(Song song);

    Page<Song> findAll(Pageable pageable);
}
