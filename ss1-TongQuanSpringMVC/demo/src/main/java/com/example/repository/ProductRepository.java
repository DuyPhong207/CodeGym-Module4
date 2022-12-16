package com.example.repository;

import com.example.model.Product;

import java.util.List;

public interface ProductRepository {
    void save(Product product);

    void delete(int id);

    void update(int id, Product product);

    List<Product> findAll();

    List<Product> search(String name);
}
