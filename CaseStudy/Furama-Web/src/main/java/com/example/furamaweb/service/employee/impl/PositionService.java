package com.example.furamaweb.service.employee.impl;

import com.example.furamaweb.model.customer.CustomerType;
import com.example.furamaweb.model.employee.Position;
import com.example.furamaweb.repository.employee.IPositionRepository;
import com.example.furamaweb.service.employee.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PositionService implements IPositionService {
    @Autowired
    private IPositionRepository iPositionRepository;

    @Override
    public List<Position> findAll() {
        return iPositionRepository.findAll();
    }

    @Override
    public Position findById(Integer id) {
        return iPositionRepository.findAllById(id);
    }
}
