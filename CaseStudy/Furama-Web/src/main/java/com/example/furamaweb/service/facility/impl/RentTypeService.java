package com.example.furamaweb.service.facility.impl;

import com.example.furamaweb.model.customer.CustomerType;
import com.example.furamaweb.model.facility.RentType;
import com.example.furamaweb.repository.facility.IRentTypeRepository;
import com.example.furamaweb.service.facility.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RentTypeService implements IRentTypeService {
    @Autowired
    private IRentTypeRepository iRentTypeRepository;

    @Override
    public List<RentType> findAll() {
        return iRentTypeRepository.findAll();
    }

    @Override
    public RentType findById(Integer id) {
        return iRentTypeRepository.findAllById(id);
    }
}
