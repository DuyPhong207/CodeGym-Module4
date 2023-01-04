package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Song {
    @Id
    private int id;
    private String name;
    private String singer;
    private String genre;
    private String filePath;

    public Song(int id, String name, String singer, String genre, String filePath) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.genre = genre;
        this.filePath = filePath;
    }

    public Song() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
