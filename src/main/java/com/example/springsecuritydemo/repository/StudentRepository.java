package com.example.springsecuritydemo.repository;

import com.example.springsecuritydemo.model.Course;
import com.example.springsecuritydemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
