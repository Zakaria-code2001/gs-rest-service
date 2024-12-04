package com.example.restservice.data;

import com.example.restservice.entities.Employee;
import com.example.restservice.storage.Employees;

public class EmployeeManager {
    private static final Employees list = new Employees();

    // This static block is executed before executing the main block
    static {
        // Creating a few employees and adding them to the list
        list.getEmployeeList().add(
                new Employee(
                        "1",
                        "Prem",
                        "Tiwari",
                        "chapradreams@gmail.com",
                        "Software Engineer"));

        list.getEmployeeList().add(
                new Employee(
                        "2",
                        "Vikash",
                        "Kumar",
                        "abc@gmail.com",
                        "Project Manager"));

        list.getEmployeeList().add(
                new Employee(
                        "3",
                        "Ritesh",
                        "Ojha",
                        "asdjf@gmail.com",
                        "Business Analyst"));
    }

    // Method to return the list
    public Employees getAllEmployees() {
        return list;
    }

    // Method to add an employee to the employees list
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
