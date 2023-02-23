package com.example.furamaweb.service;

import com.example.furamaweb.model.customer.Customer;
import com.example.furamaweb.model.employee.Employee;

import java.util.List;

public interface IEmployeeService {
    void save(Employee employee);
    void delete(Employee employee);
    void update(Employee employee);
    List<Employee> findAll();
    List<Employee> searchByNameContaining(String name);
    Employee findById(Integer id);
}
