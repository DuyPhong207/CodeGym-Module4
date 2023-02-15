package com.example.cart.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    private Integer id;
    private String name;
    private Integer price;

    private String productDesc;

    private Integer value = 0;

    public Product() {
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Product(Integer id, String name, Integer price, String productDesc, Integer value) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productDesc = productDesc;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
