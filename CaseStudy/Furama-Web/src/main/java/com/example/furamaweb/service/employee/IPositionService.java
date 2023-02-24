package com.example.furamaweb.service.employee;

import com.example.furamaweb.model.customer.CustomerType;
import com.example.furamaweb.model.employee.Position;

import java.util.List;

public interface IPositionService {
    List<Position> findAll();
    Position findById(Integer id);
}
