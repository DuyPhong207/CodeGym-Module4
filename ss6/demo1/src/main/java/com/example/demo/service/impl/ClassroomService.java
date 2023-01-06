package com.example.demo.service.impl;

import com.example.demo.model.Classroom;
import com.example.demo.repository.IClassroomRepository;
import com.example.demo.service.IClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService implements IClassroomService {

    @Autowired
    private IClassroomRepository iClassroomRepository;

    @Override
    public List<Classroom> findAll() {
        return iClassroomRepository.findAll();
    }
}
