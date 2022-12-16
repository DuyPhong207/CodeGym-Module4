package com.example.service;

import com.example.model.Category;

import java.util.List;

public interface CategoryService {
    Category getById(int id);
    List<Category> findAll();
}
