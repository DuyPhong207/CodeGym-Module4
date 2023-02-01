package com.example.musicapp.service.impl;

import com.example.musicapp.model.Song;
import com.example.musicapp.repository.ISongRepository;
import com.example.musicapp.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SongService implements ISongService {
    @Autowired
    ISongRepository iSongRepository;


    @Override
    public void save(Song song) {
        iSongRepository.save(song);
    }

    @Override
    public void update(Song song) {
        iSongRepository.save(song);
    }

    @Override
    public Page<Song> findAll(Pageable pageable) {
        return iSongRepository.findAll(pageable);
    }
}
