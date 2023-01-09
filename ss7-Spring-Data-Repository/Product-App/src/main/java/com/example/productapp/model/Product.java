package com.example.productapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    private Integer id;
    private String name;
    private Double price;
    private String productDesc;
    private String manufacture;

    public Product() {
    }

    public Product(Integer id, String name, Double price, String productDesc, String manufacture) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productDesc = productDesc;
        this.manufacture = manufacture;
    }

    public Integer getId() {
        return id;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String desc) {
        this.productDesc = desc;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
}
