package com.example.productapp.service;

import com.example.productapp.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    Page<Product> findAll(Pageable pageable);

    Page<Product> findByName(String name, Pageable pageable);

    void save(Product product);

    Product findById(Integer id);

    void update(Product product);

    void remove(int id);
}
