package com.example.lab.repository;

import com.example.lab.model.SmartPhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISmartPhoneRepository extends JpaRepository<SmartPhone, Long> {
    SmartPhone findAllById(Long id);
}
