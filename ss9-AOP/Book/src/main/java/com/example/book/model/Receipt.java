package com.example.book.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Receipt {
    @Id
    private Integer id;

    private Integer bookId;

    private String bookName;

    private String userName;

    private String userPhone;

    public Receipt() {
    }

    public Receipt(Integer id, Integer bookId, String bookName, String userName, String userPhone) {
        this.id = id;
        this.bookId = bookId;
        this.bookName = bookName;
        this.userName = userName;
        this.userPhone = userPhone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}
