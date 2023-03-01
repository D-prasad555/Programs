package com.employeeservice.app.controller;

import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.employeeservice.app.dto.APIResponseDto;
import com.employeeservice.app.dto.EmployeeDto;
import com.employeeservice.app.service.EmployeeService;

@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    // Build Save Employee REST API
    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee = employeeService.saveEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

  /*@GetMapping("{id}")
    public ResponseEntity<EmployeeDto> getEmployee(@PathVariable("id") Long employeeId)
    {
    	EmployeeDto employeeDto=employeeService.getEmployeeById(employeeId);
    	return new ResponseEntity<>(employeeDto, HttpStatus.OK);
    }*/
    //Step 7:RestTemplate->Create get rest api controller 
    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getEmployee(@PathVariable("id") Long employeeId)
    {
    	APIResponseDto apiResponseDto=employeeService.getEmployeeById(employeeId);
    	return new ResponseEntity<>(apiResponseDto, HttpStatus.OK);
    }
  
}
