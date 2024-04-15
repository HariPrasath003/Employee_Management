package com.example.employee.controller;

import com.example.employee.model.Employee;
import com.example.employee.services.EmployeeSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}