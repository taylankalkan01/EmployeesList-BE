package com.example.Employeeslist.dto;

import com.example.Employeeslist.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDtoConverter {

    public EmployeeDto convert(Employee employee){
        return EmployeeDto.builder()
                       .firstName(employee.getFirstName())
                       .lastName(employee.getLastName())
                       .email(employee.getEmail())
                .build();

    }
}
