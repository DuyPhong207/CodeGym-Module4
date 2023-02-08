package com.example.book.service;

import com.example.book.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Map;

public interface IBookService {
    void save(Book book);
    void remove(Book book);
    void update(Book book);
    Page<Book> findAll(Pageable pageable);
    Map<Book, Integer> mapBook();
}
