package com.studentservice.student.controller;

import com.studentservice.student.model.Student;
import com.studentservice.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;
    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/student/getAll")
    public ResponseEntity<List<Student>> getAllStudents(){
        return ResponseEntity.ok(studentService.getAllStudent());
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id){
        return ResponseEntity.ok(studentService.getStudentByID(id)).getBody();
    }


}
