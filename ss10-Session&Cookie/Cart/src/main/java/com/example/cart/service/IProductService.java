package com.example.cart.service;

import com.example.cart.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Product findById(Integer id);
}
