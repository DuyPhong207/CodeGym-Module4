package com.example.blogwebservice.repository;

import com.example.blogwebservice.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Integer> {
    Category findAllById(Integer id);
}
