package com.example.restservice.controllers;


import com.example.restservice.data.EmployeeManager;
import com.example.restservice.entities.Employee;
import com.example.restservice.storage.Employees;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeManager employeeDAO = new EmployeeManager();

    @GetMapping(path = "/", produces = "application/json")
    public Employees getEmployees()
    {
        return employeeDAO.getAllEmployees();
    }

    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(
            @RequestBody Employee employee)
    {

        // Creating an ID of an employee
        // from the number of employees
        Integer id = employeeDAO
                .getAllEmployees()
                .getEmployeeList()
                .size()
                + 1;

        employee.setEmployee_id(id);

        employeeDAO.addEmployee(employee);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(
                        employee.getEmployee_id())
                .toUri();

        return ResponseEntity
                .created(location)
                .build();
    }
}
