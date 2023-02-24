package com.example.furamaweb.service.facility;

import com.example.furamaweb.model.customer.CustomerType;
import com.example.furamaweb.model.facility.RentType;

import java.util.List;

public interface IRentTypeService {
    List<RentType> findAll();
    RentType findById(Integer id);
}
