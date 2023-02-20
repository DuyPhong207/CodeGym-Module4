package com.example.lab.service;

import com.example.lab.model.SmartPhone;

import java.util.Optional;

public interface ISmartPhoneService {
    Iterable<SmartPhone> findAll();

   SmartPhone findAllById(Long id);

    SmartPhone save(SmartPhone smartPhone);

    Optional<SmartPhone> findById(Long id);

    void remove(Long id);
}
