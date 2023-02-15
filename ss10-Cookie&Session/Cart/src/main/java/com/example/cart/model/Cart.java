package com.example.cart.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> productMap = new HashMap<>();

    public Cart() {
    }

    public Cart(Map<Product, Integer> productMap) {
        this.productMap = productMap;
    }

    public Map<Product, Integer> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<Product, Integer> productMap) {
        this.productMap = productMap;
    }

    private boolean checkProduct(Product product) {
        for (Map.Entry<Product, Integer> entry : productMap.entrySet()) {
            if (entry.getKey().getProductId() == product.getProductId()) {
                return true;
            }
        }
        return false;
    }

    private Map.Entry<Product, Integer> selectProduct(Product product){
        for (Map.Entry<Product, Integer> entry : productMap.entrySet()) {
            if(entry.getKey().getProductId().equals(product.getProductId())){
                return entry;
            }
        }
        return null;
    }


    private void addProduct(Product product) {
        if (!checkProduct(product)) {
            productMap.put(product, 1);
        } else {
            Map.Entry<Product, Integer> item = selectProduct(product);
            Integer newQuantity = item.getValue() + 1;
            productMap.replace(item.getKey(), newQuantity);
        }
    }

    private void removeProduct(Product product) {
        Map.Entry<Product, Integer> item = selectProduct(product);
        Integer newQuantity = item.getValue() - 1;
        productMap.replace(item.getKey(), newQuantity);
    }

    private Integer totalPayment() {
        Integer payment = 0;
        for (Map.Entry<Product, Integer> entry : productMap.entrySet()) {
            payment += entry.getKey().getPrice() * entry.getValue();
        }
        return payment;
    }
}
