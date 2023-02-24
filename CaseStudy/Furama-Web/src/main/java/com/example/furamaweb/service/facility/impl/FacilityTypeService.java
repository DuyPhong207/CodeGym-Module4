package com.example.furamaweb.service.facility.impl;

import com.example.furamaweb.model.customer.CustomerType;
import com.example.furamaweb.model.facility.FacilityType;
import com.example.furamaweb.repository.facility.IFacilityTypeRepository;
import com.example.furamaweb.service.facility.IFacilityTypeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FacilityTypeService implements IFacilityTypeService {
    @Autowired
    private IFacilityTypeRepository iFacilityTypeRepository;

    @Override
    public List<FacilityType> findAll() {
        return iFacilityTypeRepository.findAll();
    }

    @Override
    public FacilityType findById(Integer id) {
        return iFacilityTypeRepository.findAllById(id);
    }
}
