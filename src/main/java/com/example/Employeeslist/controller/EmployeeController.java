package com.example.Employeeslist.controller;

import com.example.Employeeslist.dto.EmployeeDto;
import com.example.Employeeslist.service.EmployeeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
@CrossOrigin("http://localhost:8080/")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<EmployeeDto> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
}
