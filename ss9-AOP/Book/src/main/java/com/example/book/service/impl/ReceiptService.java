package com.example.book.service.impl;

import com.example.book.model.Receipt;
import com.example.book.repository.IReceiptRepository;
import com.example.book.service.IReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ReceiptService implements IReceiptService {
    @Autowired
    IReceiptRepository iReceiptRepository;

    @Override
    public void save(Receipt receipt) {

    }

    @Override
    public void remove(Receipt receipt) {

    }

    @Override
    public void update(Receipt receipt) {

    }

    @Override
    public Page<Receipt> findAll(Pageable pageable) {
        return null;
    }
}
