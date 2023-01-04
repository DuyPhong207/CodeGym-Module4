package com.example.service.impl;

import com.example.model.Song;
import com.example.repository.SongRepository;
import com.example.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {

    @Autowired
    private SongRepository songRepository;
    @Override
    public void save(Song song) {
        songRepository.save(song);
    }

    @Override
    public void update(Song song) {
        songRepository.update(song);
    }

    @Override
    public void remove(int id) {
        songRepository.remove(id);
    }

    @Override
    public Song findById(int id) {
        return songRepository.findById(id);
    }

    @Override
    public List<Song> findAll() {
        return songRepository.findAll();
    }
}
