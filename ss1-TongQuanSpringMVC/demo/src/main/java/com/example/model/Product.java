package com.example.model;

public class Product {
    private int id;
    private String name;
    private float price;
    private String manufacture;
    private String desc;
    private Category category;

    public Product() {
    }

    public Product(int id, String name, float price, String manufacture, String desc) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacture = manufacture;
        this.desc = desc;
    }

    public Product(int id, String name, float price, String manufacture, String desc, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacture = manufacture;
        this.desc = desc;
        this.category = category;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}