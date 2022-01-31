package com.example.Employeeslist.repos;

import com.example.Employeeslist.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
