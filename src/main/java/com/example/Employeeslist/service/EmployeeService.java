package com.example.Employeeslist.service;

import com.example.Employeeslist.dto.EmployeeDto;
import com.example.Employeeslist.dto.EmployeeDtoConverter;
import com.example.Employeeslist.model.Employee;
import com.example.Employeeslist.repos.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository repository;
    private final EmployeeDtoConverter employeeDtoConverter;


    public EmployeeService(EmployeeRepository repository, EmployeeDtoConverter employeeDtoConverter) {
        this.repository = repository;
        this.employeeDtoConverter = employeeDtoConverter;
    }

    public List<EmployeeDto> getAllEmployees(){
        List<Employee> employeeList = repository.findAll();
        List<EmployeeDto> employeeDtoList = new ArrayList<>();

        for (Employee employee :employeeList){
            employeeDtoList.add(employeeDtoConverter.convert(employee));
        }
        return employeeDtoList;
    }
}
