package com.example.validateform.service.impl;

import com.example.validateform.model.User;
import com.example.validateform.repository.IUserRepository;
import com.example.validateform.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    IUserRepository iUserRepository;

    @Override
    public Page<User> findAll(Pageable pageable) {
        return iUserRepository.findAll(pageable);
    }

    @Override
    public void save(User user) {
        iUserRepository.save(user);
    }
}
