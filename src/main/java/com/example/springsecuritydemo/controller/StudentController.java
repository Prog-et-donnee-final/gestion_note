package com.example.springsecuritydemo.controller;

import com.example.springsecuritydemo.model.Student;
import com.example.springsecuritydemo.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@CrossOrigin(origins = "*")
public class StudentController {
    private StudentService userService;

    @GetMapping("/")
    public String hello(){
        return "Hello world";
    }

    @GetMapping("/students")
    public List<Student> getUsers(){
        return userService.getAll();
    }

    @GetMapping("/students/{studentId}")
    public Optional<Student> getUserById(@PathVariable Long studentId){
        return userService.getById(studentId);
    }



    @PutMapping("/students")
    public List<Student> saveUsers(@RequestBody List<Student> students){
        return userService.saveAll(students);
    }
}
