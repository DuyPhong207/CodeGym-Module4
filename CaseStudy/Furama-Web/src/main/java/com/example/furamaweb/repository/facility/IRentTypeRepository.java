package com.example.furamaweb.repository.facility;

import com.example.furamaweb.model.customer.CustomerType;
import com.example.furamaweb.model.facility.RentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRentTypeRepository extends JpaRepository<RentType, Integer> {
    RentType findAllById(Integer id);
}
