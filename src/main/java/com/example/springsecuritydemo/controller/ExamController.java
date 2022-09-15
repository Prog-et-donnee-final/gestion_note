package com.example.springsecuritydemo.controller;

import com.example.springsecuritydemo.model.Exam;
import com.example.springsecuritydemo.service.ExamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@CrossOrigin(origins= "*")
public class ExamController {
    private ExamService gradeService;

    @GetMapping("/grades")
    public List<Exam> getStudents(){
        return gradeService.getAll();
    }

    @GetMapping("/grades/{gradeId}")
    public Optional<Exam> getStudentById(@PathVariable Long gradeId){
        return gradeService.getById(gradeId);
    }

    @GetMapping("/gradesAvg")
    public List<?> findAvgStudent(){
        return gradeService.findAvgStudent();
    }

    @GetMapping("/examAvg")
    public Double findAvg(){
        return gradeService.getAvg();
    }

    @PutMapping("/grades")
    public List<Exam> saveUsers(@RequestBody List<Exam> grades){
        return gradeService.saveAll(grades);
    }
}
