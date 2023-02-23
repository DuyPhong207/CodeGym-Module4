package com.example.furamaweb.repository;

import com.example.furamaweb.model.facility.Facility;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFacilityRepository extends JpaRepository<Facility, Integer> {
    List<Facility> findAllByNameContaining(String name);
    Facility findAllById(Integer id);
}
