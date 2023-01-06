package com.example.demo.service;

import com.example.demo.dto.StudentListDto;
import com.example.demo.model.Student;

import java.util.List;

public interface IStudentService {
    List<StudentListDto> getAll();

    void save(Student student);

    Student findById(Integer codeStudent);
}
