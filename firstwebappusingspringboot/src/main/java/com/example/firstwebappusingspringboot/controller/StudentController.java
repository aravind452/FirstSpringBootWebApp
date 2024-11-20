package com.example.firstwebappusingspringboot.controller;


import com.example.firstwebappusingspringboot.model.Student;
import com.example.firstwebappusingspringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {



    @Autowired
    StudentService studentService;


    @GetMapping("/getAllStudents")

    public List<Student> getStudents() {

        return studentService.fetchAll();

    }


    @PostMapping("/addStudent")

    public void addStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
    }


    @DeleteMapping("/deleteStudent/{rollNo}")
    public String removeStudent(@PathVariable String rollNo) {
        return studentService.deleteByRollNo(rollNo);

    }

    @GetMapping("/getStudent/{rollNo}")
    public Student fetch(@PathVariable String rollNo) {
        return studentService.fetchByRollNo(rollNo);
    }


    @PutMapping("/updateStudent/{rollNo}")
    public Student updateStudent(@PathVariable String rollNo, @RequestBody Student student) {
        return studentService.updateEmployee(rollNo, student);
    }

}
