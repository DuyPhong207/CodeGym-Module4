package com.example.furamaweb.service.employee.impl;

import com.example.furamaweb.model.customer.Customer;
import com.example.furamaweb.model.customer.CustomerType;
import com.example.furamaweb.model.employee.Division;
import com.example.furamaweb.repository.employee.IDivisionRepository;
import com.example.furamaweb.service.employee.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DivisionService implements IDivisionService {
    @Autowired
    private IDivisionRepository iDivisionRepository;

    @Override
    public List<Division> findAll() {
        return iDivisionRepository.findAll();
    }

    @Override
    public Division findById(Integer id) {
        return iDivisionRepository.findAllById(id);
    }
}
