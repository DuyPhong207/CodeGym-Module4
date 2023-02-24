package com.example.furamaweb.service.customer;

import com.example.furamaweb.model.customer.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAll();
    CustomerType findById(Integer id);
}
