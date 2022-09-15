package com.example.springsecuritydemo.service;

import com.example.springsecuritydemo.model.Student;
import com.example.springsecuritydemo.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService {
    private final StudentRepository repository;

    public Optional<Student> getById(Long studentId){
        return repository.findById(studentId);
    }

    public List<Student> getAll(){
        return repository.findAll();
    }

    @Transactional
    public List<Student> saveAll(List<Student> students){
        return repository.saveAll(students);
    }
}
