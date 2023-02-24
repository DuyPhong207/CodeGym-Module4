package com.example.furamaweb.service.employee.impl;

import com.example.furamaweb.model.customer.CustomerType;
import com.example.furamaweb.model.employee.EducationDegree;
import com.example.furamaweb.repository.employee.IEducationDegreeRepository;
import com.example.furamaweb.service.employee.IEducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EducationDegreeService implements IEducationDegreeService {
    @Autowired
    private IEducationDegreeRepository iEducationDegreeRepository;

    @Override
    public List<EducationDegree> findAll() {
        return iEducationDegreeRepository.findAll();
    }

    @Override
    public EducationDegree findById(Integer id) {
        return iEducationDegreeRepository.findAllById(id);
    }
}
