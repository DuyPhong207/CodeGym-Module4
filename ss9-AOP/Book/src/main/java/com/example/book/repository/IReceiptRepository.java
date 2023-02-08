package com.example.book.repository;

import com.example.book.model.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IReceiptRepository extends JpaRepository<Receipt, Integer> {
}
