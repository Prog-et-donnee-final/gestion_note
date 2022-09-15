package com.example.springsecuritydemo.service;

import com.example.springsecuritydemo.model.Course;
import com.example.springsecuritydemo.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository repository;

    public Optional<Course> getById(Long courseId){
        return repository.findById(courseId);
    }

    public List<Course> getAll(){
        return repository.findAll();
    }

    @Transactional
    public List<Course> saveAll(List<Course> courses){
        return repository.saveAll(courses);
    }

}
