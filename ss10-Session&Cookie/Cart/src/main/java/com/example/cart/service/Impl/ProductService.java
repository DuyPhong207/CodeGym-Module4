package com.example.cart.service.Impl;

import com.example.cart.model.Product;
import com.example.cart.repository.IProductRepository;
import com.example.cart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;
    @Override
    public Iterable<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return iProductRepository.findProductById(id);
    }
}
