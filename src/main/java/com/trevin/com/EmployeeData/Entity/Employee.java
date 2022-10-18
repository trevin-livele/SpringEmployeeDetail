package com.trevin.com.EmployeeData.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EMPLOYEE_TABLE")



public class Employee {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    private String name;
    private String email;
    private int role;
    private int employeeNumber;
    private String address;
    private int phone;
    private String maritalStatus;
    private String dateOfBirth;

    public int getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = Math.toIntExact(id);
    }
}
