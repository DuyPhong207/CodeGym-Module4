package com.example.blogwebservice.controller;

import com.example.blogwebservice.dto.BlogDto;
import com.example.blogwebservice.model.Blog;
import com.example.blogwebservice.model.Category;
import com.example.blogwebservice.repository.IBlogRepository;
import com.example.blogwebservice.service.IBlogService;
import com.example.blogwebservice.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/blog")
public class BlogRestController {
    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private ICategoryService iCategoryService;
    @Autowired
    private IBlogRepository iBlogRepository;

    @GetMapping("/category")
    public List<Category> showListCategory() {
        return iCategoryService.findAll();
    }

    @GetMapping("reload")
    public List<Blog> reloadBlogPage() {
        List<Blog> blogs = iBlogService.findAll();
        return blogs;
    }

    @GetMapping("/list")
    public ModelAndView getAllBlogPage() {
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("blogs", iBlogService.findAll());
        return modelAndView;
    }

    @GetMapping("/category/{id}")
    public List<Blog> searchByCategory(@PathVariable("id") Integer id) {
        Category category = iCategoryService.findById(id);
        return iBlogRepository.findAllByCategory(category);
    }

    @PostMapping("")
    public ResponseEntity<?> saveBlog(@RequestBody BlogDto blogDto) {
        Category category = iCategoryService.findById(blogDto.getCategoryId());
        Blog blog = new Blog(blogDto.getId(),blogDto.getTitle(),blogDto.getContent(),category);
        iBlogService.save(blog);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> removeBlog(@PathVariable("id") Integer id) {
        Blog blog = iBlogService.findById(id);
        if (blog != null) {
            iBlogService.remove(blog);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
