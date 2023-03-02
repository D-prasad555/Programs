package com.employeeservice.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeeservice.app.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> 
{
	
}
