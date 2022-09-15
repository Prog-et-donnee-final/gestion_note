package com.example.springsecuritydemo.service;

import com.example.springsecuritydemo.model.Exam;
import com.example.springsecuritydemo.repository.ExamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ExamService {
    private ExamRepository repository;

    public Optional<Exam> getById(Long gradeId){
        return repository.findById(gradeId);
    }

    public List<Exam> getAll(){
        return repository.findAll();
    }

    @Transactional
    public List<Exam> saveAll(List<Exam> exams){
        return repository.saveAll(exams);
    }

    public List<?> findAvgStudent(){
        return repository.findAvgStudent();
    }

    public Double getAvg() {
        return repository.getAvg();
    }
}
