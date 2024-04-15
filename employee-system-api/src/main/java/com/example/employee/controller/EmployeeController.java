package com.example.employee.controller;

import com.example.employee.model.Employee;
import com.example.employee.services.EmployeeSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    private final EmployeeSevice employeeSevice;

    public EmployeeController(EmployeeSevice employeeSevice) {
        this.employeeSevice = employeeSevice;
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeSevice.createEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeSevice.getAllEmployees();
    }
}