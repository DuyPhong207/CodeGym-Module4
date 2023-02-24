package com.example.furamaweb.repository.customer;

import com.example.furamaweb.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerTypeRepository extends JpaRepository<CustomerType, Integer> {
    CustomerType findAllById(Integer id);
}
