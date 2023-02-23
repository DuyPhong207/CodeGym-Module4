package com.example.furamaweb.service.impl;

import com.example.furamaweb.model.employee.Employee;
import com.example.furamaweb.repository.IEmployeeRepository;
import com.example.furamaweb.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeRepository iEmployeeRepository;

    @Override
    public void save(Employee employee) {
        iEmployeeRepository.save(employee);
    }

    @Override
    public void delete(Employee employee) {
        iEmployeeRepository.delete(employee);
    }

    @Override
    public void update(Employee employee) {
        iEmployeeRepository.save(employee);
    }

    @Override
    public List<Employee> findAll() {
        return iEmployeeRepository.findAll();
    }

    @Override
    public List<Employee> searchByNameContaining(String name) {
        return iEmployeeRepository.findAllByNameContaining(name);
    }

    @Override
    public Employee findById(Integer id) {
        return iEmployeeRepository.findAllById(id);
    }
}
