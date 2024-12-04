package com.example.restservice.controllers;


import com.example.restservice.data.EmployeeManager;
import com.example.restservice.storage.Employees;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeManager employeeDAO = new EmployeeManager();

    @GetMapping(path = "/", produces = "application/json")
    public Employees getEmployees()
    {
        return employeeDAO.getAllEmployees();
    }
}
