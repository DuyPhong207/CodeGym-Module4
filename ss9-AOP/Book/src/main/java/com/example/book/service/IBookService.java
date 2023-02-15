package com.example.book.service;

import com.example.book.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Map;
import java.util.Optional;

public interface IBookService {
    void save(Book book);
    void remove(Book book);
    void update(Book book);
    Page<Book> findAll(Pageable pageable);

    Book findById(Integer id);
}
