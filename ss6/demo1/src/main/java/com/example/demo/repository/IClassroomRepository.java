package com.example.demo.repository;

import com.example.demo.model.Classroom;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;


@Transactional
public interface IClassroomRepository extends JpaRepository<Classroom, Integer> {
}
