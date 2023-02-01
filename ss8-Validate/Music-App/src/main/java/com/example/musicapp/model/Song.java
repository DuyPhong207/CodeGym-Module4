package com.example.musicapp.model;

import org.hibernate.annotations.Parent;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Tên bài hát không được để trống")
    @Size(min = 0, max = 800, message = "Tên bài hát không quá 800 kí tự")
    @Pattern(regexp = "[0-9a-zA-Z]+", message = "Tên bài hát không chứa kí tự đặc biêt")
    private String name;

    @NotNull(message = "Tên bài hát không được để trống")
    @Size(min = 0, max = 300, message = "Tên bài hát không quá 300 kí tự")
    @Pattern(regexp = "[0-9a-zA-Z]+", message = "Tên bài hát không chứa kí tự đặc biêt")
    private String singer;

    @NotNull(message = "Tên bài hát không được để trống")
    @Size(min = 0, max = 1000, message = "Tên bài hát không quá 1000 kí tự")
    @Pattern(regexp = "[0-9a-zA-Z]+", message = "Tên bài hát không chứa kí tự đặc biêt")
    private String genre;

    public Song() {
    }

    public Song(Integer id, String name, String singer, String genre) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.genre = genre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
}
