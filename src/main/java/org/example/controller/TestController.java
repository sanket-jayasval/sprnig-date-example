package org.example.controller;

import org.example.domain.Department;
import org.example.domain.Employee;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@RestController
public class TestController {

    @PutMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_XML_VALUE)
    public Employee printDept(@RequestBody Department department) {
        System.out.println(department);
        return new Employee(1, "Sanket", OffsetDateTime.now());
    }

    @GetMapping(value = "/emp", produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee getEmployee() {
        return new Employee(1, "Sanket", OffsetDateTime.now());
    }

    @GetMapping(value = "/dept", produces = MediaType.APPLICATION_ATOM_XML_VALUE)
    public Department getDepartment() {
        return new Department(1, "IT", 11);
    }
}
