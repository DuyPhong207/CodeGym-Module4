package com.example.productapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Tên sản phẩm không được để trống")
    @Size(min = 10, max = 100, message = "Tên sản phẩm phải lớn hơn 10 kí tự và nhỏ hơn 100 kí tự")
    private String name;

    @Min(value = 0, message = "Giá của sản phẩm phải lớn hơn 0")
    @Pattern(regexp = "[0-9]*", message = "Giá sản phẩm chỉ chứa số")
    private Double price;

    @Size(min = 0, max = 1000, message = "Mô tả không quá 1000 kí tự")
    private String productDesc;

    @Size(min = 0, max = 100, message = "Tên nhà sản xuất không quá 100 kí tự")
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
