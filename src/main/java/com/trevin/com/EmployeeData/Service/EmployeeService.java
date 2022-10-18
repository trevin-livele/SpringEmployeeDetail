package com.trevin.com.EmployeeData.Service;


import com.trevin.com.EmployeeData.Entity.Employee;
import com.trevin.com.EmployeeData.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public Employee saveEmployee(Employee employee){
        return repository.save(employee);
    }

    public List<Employee> saveEmployees(List<Employee> employees){
        return repository.saveAll(employees);
    }

    public List<Employee> getEmployees(){
        return repository.findAll();
    }

    public Employee getEmployeeById(int id){
        return repository.findById(id).orElse(null);
    }
    public Employee getEmployeeByName(String name){
        return repository.findByName(name);
    }

    public String deleteEmployee(int id){
        repository.deleteById(id);
        return "Employee has been deleted" +id;
    }

    public Employee updateEmployee(Employee employee){
        Employee existingEmployee=repository.findById(employee.getId()).orElse(null);
        existingEmployee.setName(employee.getName());
        existingEmployee.setEmployeeNumber(employee.getEmployeeNumber());
        existingEmployee.setAddress(employee.getAddress());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setDateOfBirth(employee.getDateOfBirth());
        existingEmployee.setPhone(employee.getPhone());
        existingEmployee.setMaritalStatus(employee.getMaritalStatus());
        existingEmployee.setRole(employee.getRole());
        return repository.save(existingEmployee);


    }



}
