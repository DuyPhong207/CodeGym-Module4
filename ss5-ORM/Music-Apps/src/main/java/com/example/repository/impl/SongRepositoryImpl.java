package com.example.repository.impl;

import com.example.model.Song;
import com.example.repository.SongRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SongRepositoryImpl implements SongRepository {


    @Override
    public void save(Song song) {
        BaseRepository.entityManager.getTransaction().begin();
        BaseRepository.entityManager.persist(song);
        BaseRepository.entityManager.getTransaction().commit();
    }

    @Override
    public void update(Song song) {
        BaseRepository.entityManager.getTransaction().begin();
        BaseRepository.entityManager.merge(song);
        BaseRepository.entityManager.getTransaction().commit();
    }

    @Override
    public void remove(int id) {
        BaseRepository.entityManager.getTransaction().begin();
        Song song = findById(id);
        BaseRepository.entityManager.remove(song);
        BaseRepository.entityManager.getTransaction().commit();
    }

    @Override
    public Song findById(int id) {
        Song song = BaseRepository.entityManager.createQuery("SELECT s FROM Song s WHERE id =? 1", Song.class)
                .setParameter(1, id).getSingleResult();
        return song;
    }

    @Override
    public List<Song> findAll() {
        List<Song> songs = BaseRepository.entityManager.createQuery("SELECT s FROM Song s", Song.class)
                .getResultList();
        return songs;
    }
}
