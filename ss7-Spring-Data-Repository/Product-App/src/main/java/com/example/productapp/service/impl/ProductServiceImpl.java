package com.example.productapp.service.impl;

import com.example.productapp.model.Product;
import com.example.productapp.repository.ProductRepository;
import com.example.productapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Page<Product> findByName(String name, Pageable pageable) {
        return productRepository.findAllByNameContaining(name, pageable);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product findById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Product product) {
        productRepository.save(product);
    }

    @Override
    public void remove(int id) {
        Product product = this.findById(id);
        productRepository.delete(product);
    }
}
