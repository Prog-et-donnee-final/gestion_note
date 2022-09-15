package com.example.springsecuritydemo.repository;

import com.example.springsecuritydemo.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {
    @Query(value = "select s.first_name,s.ref ,AVG(e.grade) FROM Exam e INNER JOIN Student s ON  e.student_id=s.id  GROUP BY s.first_name,s.ref",nativeQuery = true)
    List<?> findAvgStudent();

    @Query("select AVG(grade) FROM Exam ")
    Double  getAvg();
}
