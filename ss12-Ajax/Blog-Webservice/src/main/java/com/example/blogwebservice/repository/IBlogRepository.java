package com.example.blogwebservice.repository;

import com.example.blogwebservice.model.Blog;
import com.example.blogwebservice.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    Blog findAllById(Integer id);
    List<Blog> findAllByCategory(Category category);
}
