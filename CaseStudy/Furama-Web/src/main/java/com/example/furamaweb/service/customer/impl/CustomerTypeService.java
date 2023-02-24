package com.example.furamaweb.service.customer.impl;

import com.example.furamaweb.model.customer.CustomerType;
import com.example.furamaweb.repository.customer.ICustomerTypeRepository;
import com.example.furamaweb.service.customer.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    private ICustomerTypeRepository iCustomerTypeRepository;

    @Override
    public List<CustomerType> findAll() {
        return iCustomerTypeRepository.findAll();
    }

    @Override
    public CustomerType findById(Integer id) {
        return iCustomerTypeRepository.findAllById(id);
    }
}
