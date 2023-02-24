package com.example.furamaweb.service.employee;

import com.example.furamaweb.model.customer.CustomerType;
import com.example.furamaweb.model.employee.EducationDegree;

import java.util.List;

public interface IEducationDegreeService {
    List<EducationDegree> findAll();
    EducationDegree findById(Integer id);
}
