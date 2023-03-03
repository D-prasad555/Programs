package com.employeeservice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;


//@EnableFeignClients is a Spring annotation that enables the Feign client in a Spring Boot application. Feign is a Java-based HTTP client for RESTful web services. It simplifies the communication between microservices by allowing developers to declare interfaces that define the REST API they want to consume, and Feign generates the implementation code for those interfaces.	
//Step 1:FeignClient->Add @EnableFeignClients annotation
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class EmployeeServiceApplication {

  /*Step 3:RestTemplate->Configure RestTemplate as spring bean
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}*/
	
  /*Step 1:webclient->configure webclient as spring bean
	@Bean
	public WebClient webClient()
	{
		return WebClient.builder().build();
	}*/
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
