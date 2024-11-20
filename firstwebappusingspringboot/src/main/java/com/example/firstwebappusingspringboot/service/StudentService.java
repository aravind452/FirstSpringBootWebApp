package com.example.firstwebappusingspringboot.service;


import com.example.firstwebappusingspringboot.model.Student;
import com.example.firstwebappusingspringboot.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {


    @Autowired
    StudentRepo studentRepo;

    public void saveStudent(Student student) {
        studentRepo.save(student);
    }

    public Student fetchByRollNo(String rollNo) {
        return studentRepo.findById(rollNo).orElse(new Student());
    }

    public String deleteByRollNo(String rollNo) {
        studentRepo.deleteById(rollNo);
        return "data deleted";
    }


    public List<Student> fetchAll() {
        return studentRepo.findAll();
    }

    public Student updateEmployee(String rollNo, Student newStudent) {
        Student existingStudent = studentRepo.findById(rollNo).orElse(null);
        if (existingStudent != null) {
            existingStudent.setName(newStudent.getName());
            existingStudent.setAge(newStudent.getAge());
            existingStudent.setPhone(newStudent.getPhone());
            return studentRepo.save(existingStudent);
        }
        return null;
    }


}