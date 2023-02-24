package com.example.furamaweb.service.facility.impl;

import com.example.furamaweb.model.facility.Facility;
import com.example.furamaweb.repository.facility.IFacilityRepository;
import com.example.furamaweb.service.facility.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FacilityService implements IFacilityService {
    @Autowired
    private IFacilityRepository iFacilityRepository;

    @Override
    public void save(Facility facility) {
        iFacilityRepository.save(facility);
    }

    @Override
    public void delete(Facility facility) {
        iFacilityRepository.delete(facility);
    }

    @Override
    public void update(Facility facility) {
        iFacilityRepository.save(facility);
    }

    @Override
    public List<Facility> findAll() {
        return iFacilityRepository.findAll();
    }

    @Override
    public List<Facility> searchByNameContaining(String name) {
        return iFacilityRepository.findAllByNameContaining(name);
    }

    @Override
    public Facility findById(Integer id) {
        return iFacilityRepository.findAllById(id);
    }
}
