package com.trevin.com.EmployeeData.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EMPLOYEE_TABLE")
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private int role;
    private int employeeNumber;
    private String address;
    private int phone;
    private String maritalStatus;
    private String dateOfBirth;
}
