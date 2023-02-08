package com.example.book.service;

import com.example.book.model.Receipt;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IReceiptService {
    void save(Receipt receipt);
    void remove(Receipt receipt);
    void update(Receipt receipt);
    Page<Receipt> findAll(Pageable pageable);
}
