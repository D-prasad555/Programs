package com.departmentservice.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RefreshScope annotation is used in a springboot application to enable dynamic reloading of configuration properties(application.properties) without restarting the application. This is useful in situations where you need to modify the configuration properties at runtime, without restarting application 
@RefreshScope
@RestController
public class MessageController
{
	//This class is used refresh application.properties when we update application.properties file. So no restart required for microservices after updating or modifying application.properties just we need to restart config server.
	//Springboot actuator provides refresh api which is used to reloading application.properties file
	//spring.boot.message property is specified in department-service.properties file in git repo
	@Value("${spring.boot.message}")
	private String message;
	
	@GetMapping("message")
	public String message()
	{
		return message;
	}
}
