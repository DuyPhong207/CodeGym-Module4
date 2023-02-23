package com.example.furamaweb.service;

import com.example.furamaweb.model.contract.Contract;
import com.example.furamaweb.model.employee.Employee;

import java.util.List;

public interface IContractService {
    void save(Contract contract);
    void delete(Contract contract);
    void update(Contract contract);
    List<Contract> findAll();
    Contract findById(Integer id);
}
