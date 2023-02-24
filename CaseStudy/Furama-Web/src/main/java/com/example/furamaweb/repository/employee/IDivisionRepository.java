package com.example.furamaweb.repository.employee;

import com.example.furamaweb.model.customer.CustomerType;
import com.example.furamaweb.model.employee.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDivisionRepository extends JpaRepository<Division, Integer> {
    Division findAllById(Integer id);
}
