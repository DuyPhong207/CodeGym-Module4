package com.example.service.impl;

import com.example.model.Product;
import com.example.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private static List<Product> products = new ArrayList<>();
    static {
        products.add(new Product(1, "Iphone 6", 4000000, "Gold", "Apple"));
        products.add(new Product(1, "Iphone 6s", 5000000, "Black", "Apple"));
        products.add(new Product(1, "Iphone 7", 6000000, "Gold", "Apple"));
        products.add(new Product(1, "Iphone 8", 6500000, "Red", "Apple"));
        products.add(new Product(1, "Iphone X", 8500000, "Black", "Apple"));
        products.add(new Product(1, "Iphone 11", 10000000, "Black", "Apple"));
        products.add(new Product(1, "Iphone 12", 18000000, "Blue", "Apple"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products);
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.add(id, product);

    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
