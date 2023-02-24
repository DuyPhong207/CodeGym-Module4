package com.example.furamaweb.service.facility;

import com.example.furamaweb.model.customer.CustomerType;
import com.example.furamaweb.model.facility.FacilityType;

import java.util.List;

public interface IFacilityTypeService {
    List<FacilityType> findAll();
    FacilityType findById(Integer id);
}
