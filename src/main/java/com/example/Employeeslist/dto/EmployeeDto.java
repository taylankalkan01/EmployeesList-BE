package com.example.Employeeslist.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class EmployeeDto {

    private String firstName;

    private String lastName;

    private String email;
}
