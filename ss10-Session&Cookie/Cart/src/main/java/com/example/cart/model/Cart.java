package com.example.cart.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {
    Map<Product, Integer> products = new HashMap<>();

    public Cart() {
    }

    public Cart(Map<Product, Integer> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        if (!checkProduct(product)) {
            products.put(product, 1);
        } else {
            for (Map.Entry<Product, Integer> entry : products.entrySet()) {
                if (!checkProduct(product)) {
                    products.replace(entry.getKey(), entry.getValue() + 1);
                }
            }
        }
    }

    public boolean checkProduct(Product product) {
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            if (entry.getKey().getId().equals(product.getId())) {
                return true;
            }
        }
        return false;
    }

    public void removeProduct(Product product) {
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            if (!checkProduct(product)) {
                products.replace(entry.getKey(), entry.getValue() - 1);
            }
        }
    }

    public Map.Entry<Product, Integer> selectProduct(Product product) {
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            if (entry.getKey().getId().equals(product.getId())) {
                return entry;
            }
        }
        return null;
    }

    public Integer totalPay() {
        Integer pay = 0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            pay += entry.getKey().getPrice() * entry.getValue();
        }
        return pay;
    }

    public List<Product> getListProductInCart() {
        List<Product> productList = new ArrayList<>();
        for (Map.Entry<Product, Integer> entry : this.products.entrySet()) {
            entry.getKey().setValue(entry.getValue());
            productList.add(entry.getKey());
        }
        return productList;
    }
}
