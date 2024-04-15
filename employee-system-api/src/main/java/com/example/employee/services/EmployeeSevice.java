package com.example.employee.services;

import com.example.employee.model.Employee;

import java.util.List;

public interface EmployeeSevice {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();
}
