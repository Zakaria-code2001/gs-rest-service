package com.example.restservice;

import com.example.restservice.entities.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void testCreatingEmployeeSuccessfully() {
        Employee employee = new Employee("2",
                "Vikash",
                "Kumar",
                "abc@gmail.com",
                "Title2");

        assertEquals("2", employee.getEmployee_id());
        assertEquals("Vikash", employee.getFirstName());
        assertEquals("abc@gmail.com", employee.getEmail());
        assertEquals("Title2", employee.getTitle());
    }

}