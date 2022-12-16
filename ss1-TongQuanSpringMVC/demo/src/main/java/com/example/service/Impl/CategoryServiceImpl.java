package com.example.service.Impl;

import com.example.model.Category;
import com.example.repository.CategoryRepository;
import com.example.repository.Impl.CategoryRepositoryImpl;
import com.example.service.CategoryService;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    CategoryRepository repository = new CategoryRepositoryImpl();

    @Override
    public Category getById(int id) {
        return repository.getById(id);
    }

    @Override
    public List<Category> findAll() {
        return repository.findAll();
    }
}
