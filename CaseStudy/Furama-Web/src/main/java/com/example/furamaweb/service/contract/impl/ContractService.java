package com.example.furamaweb.service.contract.impl;

import com.example.furamaweb.model.contract.Contract;
import com.example.furamaweb.repository.contract.IContractRepository;
import com.example.furamaweb.service.contract.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService implements IContractService {
    @Autowired
    private IContractRepository iContractRepository;
    @Override
    public void save(Contract contract) {
        iContractRepository.save(contract);
    }

    @Override
    public void delete(Contract contract) {
        iContractRepository.delete(contract);
    }

    @Override
    public void update(Contract contract) {
        iContractRepository.save(contract);
    }

    @Override
    public List<Contract> findAll() {
        return iContractRepository.findAll();
    }

    @Override
    public Contract findById(Integer id) {
        return iContractRepository.findAllById(id);
    }
}
