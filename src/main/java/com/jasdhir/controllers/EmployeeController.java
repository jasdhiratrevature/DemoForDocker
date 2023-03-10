package com.jasdhir.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jasdhir.model.Employee;

@RestController
public class EmployeeController {

	@GetMapping("/employee")
	public ResponseEntity<Employee> getEmployee(){
		Employee emp=new Employee(1,"Jasdhir");
		return ResponseEntity.ok().body(emp);
	}
}
