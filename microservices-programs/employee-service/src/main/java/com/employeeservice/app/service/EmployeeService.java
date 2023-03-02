package com.employeeservice.app.service;


import com.employeeservice.app.dto.APIResponseDto;
import com.employeeservice.app.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
 // EmployeeDto getEmployeeById(Long employeeId);
    APIResponseDto getEmployeeById(Long employeeId);

}
