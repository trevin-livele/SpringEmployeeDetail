package com.trevin.com.EmployeeData.Repository;

import com.trevin.com.EmployeeData.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee findByName(String name);
}
