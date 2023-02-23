package com.example.furamaweb.service.impl;

import com.example.furamaweb.model.customer.Customer;
import com.example.furamaweb.repository.ICustomerRepository;
import com.example.furamaweb.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public void delete(Customer customer) {
        iCustomerRepository.delete(customer);
    }

    @Override
    public void update(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public List<Customer> searchByNameContaining(String name) {
        return iCustomerRepository.findAllByNameContaining(name);
    }

    @Override
    public Customer findById(Integer id) {
        return iCustomerRepository.findAllById(id);
    }
}
