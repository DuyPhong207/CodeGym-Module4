package com.example.service.Impl;

import com.example.model.Product;
import com.example.repository.Impl.ProductRepositoryImpl;
import com.example.repository.ProductRepository;
import com.example.service.ProductService;


import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductRepository repository = new ProductRepositoryImpl();


    @Override
    public void save(Product product) {
        repository.save(product);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public void update(int id, Product product) {
        repository.update(id, product);
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Product> search(String name) {
        return repository.search(name);
    }
}
