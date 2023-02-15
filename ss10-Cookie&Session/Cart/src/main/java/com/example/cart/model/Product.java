package com.example.cart.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Product {
    @Id
    private Integer productId;
    private String productName;
    private Integer price;
    private String productDesc;

    public Product() {
    }

    public Product(Integer productId, String productName, Integer price, String productDesc) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.productDesc = productDesc;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }
}
