package com.example.Employeeslist.config;

import com.example.Employeeslist.model.Employee;
import com.example.Employeeslist.repos.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements CommandLineRunner {
    private final EmployeeRepository employeeRepository;

    public SampleRunner(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Employee employee1 = Employee.builder()
                .firstName("Eren")
                .lastName("Kalkan")
                .email("eren@gmail.com")
                .build();

         employeeRepository.save(employee1);

        Employee employee2 = Employee.builder()
                .firstName("Taylan")
                .lastName("Kalkan")
                .email("taylan@gmail.com")
                .build();
        employeeRepository.save(employee2);

        Employee employee3 = Employee.builder()
                .firstName("Hazal")
                .lastName("Kalkan")
                .email("hazal@gmail.com")
                .build();
        employeeRepository.save(employee3);

    }
}

