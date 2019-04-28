package com.g33kzone.helloworld.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.g33kzone.helloworld.model.Employee;

@RestController
public class HelloController {
	
	@GetMapping(path="/hello",produces=MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> greetings() {
		
		return ResponseEntity.status(HttpStatus.OK).body("Hello World - Welcome to GCP Cloud Build using K8s...");
	}
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		return emp;
	}

}
