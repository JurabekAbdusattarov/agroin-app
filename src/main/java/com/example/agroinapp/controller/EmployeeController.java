package com.example.agroinapp.controller;

import com.example.agroinapp.Model.Employee;
import com.example.agroinapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public HttpEntity getAllEmployee(){
        List<Employee> employeeList= employeeRepository.findAll();
        return ResponseEntity.ok(employeeList);
    }


}
