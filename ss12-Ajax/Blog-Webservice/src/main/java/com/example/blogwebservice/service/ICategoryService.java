package com.example.blogwebservice.service;

import com.example.blogwebservice.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    List<Category> findAll();
    Category findById(Integer id);
}
