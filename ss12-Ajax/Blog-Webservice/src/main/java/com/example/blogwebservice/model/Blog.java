package com.example.blogwebservice.model;

import javax.persistence.*;

@Entity
public class Blog {
    @Id
    private Integer id;

    private String title;

    private String content;

    @ManyToOne
    @JoinColumn(name = "Id_Category")
    private Category category;

    public Blog() {
    }

    public Blog(Integer id, String title, String content, Category category) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.category = category;
    }

    public Blog(Integer id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}