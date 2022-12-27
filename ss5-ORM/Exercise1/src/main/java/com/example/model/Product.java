package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Product {
    @Id
    private int id;
    private String name;
    private double price;
    private String productDesc;
    private String manufacture;

    public Product() {
    }

    public Product(int id, String name, double price, String productDesc, String manufacture) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productDesc = productDesc;
        this.manufacture = manufacture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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
