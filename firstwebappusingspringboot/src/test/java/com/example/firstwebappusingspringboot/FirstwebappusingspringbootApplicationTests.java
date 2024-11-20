package com.example.firstwebappusingspringboot;

import com.example.firstwebappusingspringboot.model.Student;
import com.example.firstwebappusingspringboot.repo.StudentRepo;
import com.example.firstwebappusingspringboot.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FirstwebappusingspringbootApplicationTests {


    @Autowired
    StudentService studentService;

    @Autowired
    StudentRepo studentRepo;

//    @Test
//    void contextLoads() {
//    }

    @Test
    public void testSaveStudent() {

        Student student = new Student();
        student.setAge(23);
        student.setName("aravind");
        student.setPhone(78999999);
        student.setRollNo("19cs282");

        studentService.saveStudent(student);
        assertEquals("aravind", student.getName(),"employee name should match");
        assertEquals(789999, student.getPhone());



    }

}


