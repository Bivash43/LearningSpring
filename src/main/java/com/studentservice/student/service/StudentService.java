package com.studentservice.student.service;

import com.studentservice.student.model.Student;

import java.util.List;

public interface StudentService {

    String deleteStudentById(int id);

    public Student saveStudent(Student student);

    public List<Student> getAllStudent();


    Student getStudentByID(int id);
}
