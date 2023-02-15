package com.example.blogwebservice.service.impl;

import com.example.blogwebservice.model.Category;
import com.example.blogwebservice.repository.ICategoryRepository;
import com.example.blogwebservice.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;


    @Override
    public List<Category> findAll() {
        return iCategoryRepository.findAll();
    }

    @Override
    public Category findById(Integer id) {
        return iCategoryRepository.findAllById(id);
    }
}
