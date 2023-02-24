package com.example.furamaweb.repository.facility;

import com.example.furamaweb.model.customer.CustomerType;
import com.example.furamaweb.model.facility.FacilityType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacilityTypeRepository extends JpaRepository<FacilityType, Integer> {
    FacilityType findAllById(Integer id);
}
