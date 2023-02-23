package com.example.furamaweb.repository;

import com.example.furamaweb.model.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findAllByNameContaining(String name);
    Employee findAllById(Integer id);
}
