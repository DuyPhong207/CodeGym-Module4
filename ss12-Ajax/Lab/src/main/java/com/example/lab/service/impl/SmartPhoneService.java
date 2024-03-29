package com.example.lab.service.impl;

import com.example.lab.model.SmartPhone;
import com.example.lab.repository.ISmartPhoneRepository;
import com.example.lab.service.ISmartPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SmartPhoneService implements ISmartPhoneService {
    @Autowired
    private ISmartPhoneRepository iSmartPhoneRepository;

    @Override
    public Iterable<SmartPhone> findAll() {
        return iSmartPhoneRepository.findAll();
    }

    @Override
    public SmartPhone findAllById(Long id) {
        return iSmartPhoneRepository.findAllById(id);
    }

    @Override
    public SmartPhone save(SmartPhone smartPhone) {
        return iSmartPhoneRepository.save(smartPhone);
    }

    @Override
    public Optional<SmartPhone> findById(Long id) {
        return iSmartPhoneRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        iSmartPhoneRepository.deleteById(id);
    }
}
