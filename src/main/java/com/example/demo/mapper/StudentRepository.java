package com.example.demo.mapper;

import com.example.demo.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Integer> {
}
