package com.example.furamaweb.repository;

import com.example.furamaweb.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findAllByNameContaining(String name);
    Customer findAllById(Integer id);
}
