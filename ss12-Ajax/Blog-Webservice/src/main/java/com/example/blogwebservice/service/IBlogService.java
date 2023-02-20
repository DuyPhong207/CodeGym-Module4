package com.example.blogwebservice.service;

import com.example.blogwebservice.model.Blog;
import com.example.blogwebservice.model.Category;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    void save(Blog blog);
    void remove(Blog blog);
    void update(Blog blog);
    List<Blog> findAll();
    Blog findById(Integer id);
    List<Blog> findByCategory(Category category);
}
