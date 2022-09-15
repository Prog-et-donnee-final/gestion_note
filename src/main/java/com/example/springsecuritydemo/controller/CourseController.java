package com.example.springsecuritydemo.controller;

import com.example.springsecuritydemo.model.Course;
import com.example.springsecuritydemo.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@CrossOrigin(origins = "*")
public class CourseController {
    private CourseService postService;

    @GetMapping("/courses")
    public List<Course> getPosts(){
        return postService.getAll();
    }

    @GetMapping("/courses/{courseId}")
    public Optional<Course> getPostById(@PathVariable Long courseId){
        return postService.getById(courseId);
    }

    @PutMapping("/courses")
    public List<Course> savePosts(@RequestBody List<Course> courses){
        return postService.saveAll(courses);
    }

    }
