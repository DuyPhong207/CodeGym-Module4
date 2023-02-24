package com.example.furamaweb.service.facility;

import com.example.furamaweb.model.customer.Customer;
import com.example.furamaweb.model.employee.Employee;
import com.example.furamaweb.model.facility.Facility;

import java.util.List;

public interface IFacilityService {
    void save(Facility facility);
    void delete(Facility facility);
    void update(Facility facility);
    List<Facility> findAll();
    List<Facility> searchByNameContaining(String name);
    Facility findById(Integer id);
}
