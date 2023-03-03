package com.employeeservice.app.service.impl;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.employeeservice.app.dto.APIResponseDto;
import com.employeeservice.app.dto.EmployeeDto;
import com.employeeservice.app.entity.DepartmentDto;
import com.employeeservice.app.entity.Employee;
import com.employeeservice.app.mapper.EmployeeMapper;
import com.employeeservice.app.repository.EmployeeRepository;
import com.employeeservice.app.service.APIClient;
import com.employeeservice.app.service.EmployeeService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService 
{
    private EmployeeRepository employeeRepository;

    //Step 4:RestTemplate-> Injecting RestTemplate here to use methods of RestTemplate
    //private RestTemplate restTemplate;

    //Step 2:WebClient->Inject and use WebClient to call the Rest api
    //private WebClient webClient;
    
    //Step 3:FeignClient->Inject ApiClient and use methods to call rest api
    private APIClient apiClient;
    
    private Logger logger=LoggerFactory.getLogger(EmployeeServiceImpl.class);
    
    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);

        Employee saveDEmployee = employeeRepository.save(employee);

        EmployeeDto savedEmployeeDto = EmployeeMapper.mapToEmployeeDto(saveDEmployee);

        return savedEmployeeDto;
    }



   /*public EmployeeDto getEmployeeById(Long employeeId) 
	{
		Employee employee=employeeRepository.findById(employeeId).get();
		EmployeeDto employeeDto=new EmployeeDto(
				employee.getId(),
				employee.getFirstName(),
				employee.getLastName(),
				employee.getEmail(),
				employee.getDepartmentCode()
		);
		return employeeDto;
	}*/
    //Step 1:circuit breaker->Add @CircuitBreaker annotation give circuit breaker name and fallbackmethod name as attributes
    //@CircuitBreaker(name="${spring.application.name}", fallbackMethod = "getDefaultDepartment")
    @Retry(name="${spring.application.name}", fallbackMethod = "getDefaultDepartment")
    @Override
	public APIResponseDto getEmployeeById(Long employeeId) 
	{
	
    	Employee employee=employeeRepository.findById(employeeId).get();
		
		//Step 6:RestTemplate->use RestTemplate method to get department details from department-service. getForEntity() method takes 2 arguments string url and object type. This method returns DepartmentDto object
	    /*ResponseEntity<DepartmentDto> responseEntity=restTemplate.getForEntity("http://localhost:8080/api/departments/"+employee.getDepartmentCode(),DepartmentDto.class);
		DepartmentDto departmentDto=responseEntity.getBody();*/
		
		//Step 3:WebClient->Use methods of webclient to get department details
		//DepartmentDto departmentDto=webClient.get().uri("http://localhost:8080/api/departments/"+employee.getDepartmentCode()).retrieve().bodyToMono(DepartmentDto.class).block();
		
		//Step 4:FeignClient->Use methods of feignclient to get departments details
		DepartmentDto departmentDto=apiClient.getDepartment(employee.getDepartmentCode());
		
		EmployeeDto employeeDto=new EmployeeDto(
				employee.getId(),
				employee.getFirstName(),
				employee.getLastName(),
				employee.getEmail(),
				employee.getDepartmentCode()
		);
		
		APIResponseDto apiResponseDto=new APIResponseDto();
		apiResponseDto.setEmployee(employeeDto);
		apiResponseDto.setDepartment(departmentDto);
		return apiResponseDto;
	}
    //Step 2:Circuit breaker->Implement getDefaultDepartment method
    public APIResponseDto getDefaultDepartment(Long employeeId, Exception exception) 
    {
    	DepartmentDto departmentDto=new DepartmentDto();
    	departmentDto.setDepartmentName("R&D department");
    	departmentDto.setDepartmentCode("101");
    	departmentDto.setDepartmentDescription("Research and development department");
    	Employee employee=employeeRepository.findById(employeeId).get();
    	EmployeeDto employeeDto=new EmployeeDto(
				employee.getId(),
				employee.getFirstName(),
				employee.getLastName(),
				employee.getEmail(),
				employee.getDepartmentCode()
		);
		
		APIResponseDto apiResponseDto=new APIResponseDto();
		apiResponseDto.setEmployee(employeeDto);
		apiResponseDto.setDepartment(departmentDto);
		return apiResponseDto;
    }
}
