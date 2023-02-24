package com.example.furamaweb.repository.employee;

import com.example.furamaweb.model.customer.CustomerType;
import com.example.furamaweb.model.employee.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPositionRepository extends JpaRepository<Position, Integer> {
    Position findAllById(Integer id);
}
