package com.example.book.service.impl;

import com.example.book.model.Book;
import com.example.book.repository.IBookRepository;
import com.example.book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class BookService implements IBookService {
    @Autowired
    IBookRepository iBookRepository;

    @Override
    public void save(Book book) {
        iBookRepository.save(book);
    }

    @Override
    public void remove(Book book) {
        iBookRepository.delete(book);
    }

    @Override
    public void update(Book book) {
        iBookRepository.save(book);
    }

    @Override
    public Page<Book> findAll(Pageable pageable) {
        return iBookRepository.findAll(pageable);
    }

    @Override
    public Map<Book, Integer> mapBook() {
        List<Book> books = iBookRepository.findAll();
        Map<Book, Integer> bookMap = new TreeMap<>();
        for (Book book : books) {
            bookMap.put(book, book.getAmount());
        }
        return bookMap;
    }
}
