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

/*
* import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

@SpringBootTest
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService service;

    @Test
    public void testSaveEmployee() {
        Employee employee = new Employee();
        employee.setName("Alice");
        employee.setDepartment("Engineering");
        employee.setSalary(80000.0);

        Employee savedEmployee = service.saveEmployee(employee);

        assertNotNull(savedEmployee, "Saved employee should not be null");
        assertEquals("Alice", savedEmployee.getName(), "Employee name should match");
        assertEquals(80000.0, savedEmployee.getSalary(), "Salary should match");
    }

    @Test
    public void testGetAllEmployees() {
        Employee employee1 = new Employee();
        employee1.setName("John");
        employee1.setDepartment("Finance");
        employee1.setSalary(70000.0);

        Employee employee2 = new Employee();
        employee2.setName("Jane");
        employee2.setDepartment("HR");
        employee2.setSalary(60000.0);

        service.saveEmployee(employee1);
        service.saveEmployee(employee2);

        List<Employee> employees = service.getAllEmployees();

        assertNotNull(employees, "Employee list should not be null");
        assertEquals(2, employees.size(), "Employee list size should be 2");
    }

    @Test
    public void testGetEmployeeById() {
        Employee employee = new Employee();
        employee.setName("Charlie");
        employee.setDepartment("IT");
        employee.setSalary(90000.0);

        Employee savedEmployee = service.saveEmployee(employee);

        Employee foundEmployee = service.getEmployeeById(savedEmployee.getId());

        assertNotNull(foundEmployee, "Found employee should not be null");
        assertEquals(savedEmployee.getId(), foundEmployee.getId(), "IDs should match");
        assertEquals("Charlie", foundEmployee.getName(), "Names should match");
    }

    @Test
    public void testUpdateEmployee() {
        Employee employee = new Employee();
        employee.setName("Eve");
        employee.setDepartment("Marketing");
        employee.setSalary(75000.0);

        Employee savedEmployee = service.saveEmployee(employee);

        Employee updateDetails = new Employee();
        updateDetails.setName("Eve Updated");
        updateDetails.setDepartment("Sales");
        updateDetails.setSalary(80000.0);

        Employee updatedEmployee = service.updateEmployee(savedEmployee.getId(), updateDetails);

        assertNotNull(updatedEmployee, "Updated employee should not be null");
        assertNotEquals("Eve", updatedEmployee.getName(), "Employee name should be updated");
        assertEquals("Eve Updated", updatedEmployee.getName(), "Updated name should match");
        assertEquals("Sales", updatedEmployee.getDepartment(), "Updated department should match");
        assertEquals(80000.0, updatedEmployee.getSalary(), "Updated salary should match");
    }

    @Test
    public void testDeleteEmployee() {
        Employee employee = new Employee();
        employee.setName("Frank");
        employee.setDepartment("Logistics");
        employee.setSalary(65000.0);

        Employee savedEmployee = service.saveEmployee(employee);

        service.deleteEmployee(savedEmployee.getId());

        Employee deletedEmployee = service.getEmployeeById(savedEmployee.getId());
        assertNull(deletedEmployee, "Deleted employee should be null");
    }
}
*/


