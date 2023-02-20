package com.example.blogwebservice.service.impl;

import com.example.blogwebservice.model.Blog;
import com.example.blogwebservice.model.Category;
import com.example.blogwebservice.repository.IBlogRepository;
import com.example.blogwebservice.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public void remove(Blog blog) {
        iBlogRepository.delete(blog);
    }

    @Override
    public void update(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public Blog findById(Integer id) {
        return iBlogRepository.findAllById(id);
    }

    @Override
    public List<Blog> findByCategory(Category category) {
        return iBlogRepository.findAllByCategory(category);
    }
}
