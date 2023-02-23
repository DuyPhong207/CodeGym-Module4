package com.example.furamaweb.repository;

import com.example.furamaweb.model.contract.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContractRepository extends JpaRepository<Contract, Integer> {
    Contract findAllById(Integer id);
}
