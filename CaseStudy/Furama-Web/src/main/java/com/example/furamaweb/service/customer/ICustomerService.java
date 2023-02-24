package com.example.furamaweb.service.customer;

import com.example.furamaweb.model.customer.Customer;

import java.util.List;

public interface ICustomerService {
    void save(Customer customer);
    void delete(Customer customer);
    void update(Customer customer);
    List<Customer> findAll();
    List<Customer> searchByNameContaining(String name);
    Customer findById(Integer id);
}
