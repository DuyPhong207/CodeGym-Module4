package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface ProductService {
    void save(Product product);

    void delete(int id);

    void update(int id, Product product);

    List<Product> findAll();

    List<Product> search(String name);
}
