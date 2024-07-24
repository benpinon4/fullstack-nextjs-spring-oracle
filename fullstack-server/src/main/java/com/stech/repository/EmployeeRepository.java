package com.stech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stech.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
 
    Employee findByFirstName(String name);
 
}