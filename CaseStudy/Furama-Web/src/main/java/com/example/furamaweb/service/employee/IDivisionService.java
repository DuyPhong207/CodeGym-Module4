package com.example.furamaweb.service.employee;

import com.example.furamaweb.model.customer.CustomerType;
import com.example.furamaweb.model.employee.Division;

import java.util.List;

public interface IDivisionService {
    List<Division> findAll();
    Division findById(Integer id);
}
