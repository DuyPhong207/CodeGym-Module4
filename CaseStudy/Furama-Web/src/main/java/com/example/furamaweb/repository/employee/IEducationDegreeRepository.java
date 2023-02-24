package com.example.furamaweb.repository.employee;

import com.example.furamaweb.model.customer.CustomerType;
import com.example.furamaweb.model.employee.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEducationDegreeRepository extends JpaRepository<EducationDegree, Integer> {
    EducationDegree findAllById(Integer id);
}
