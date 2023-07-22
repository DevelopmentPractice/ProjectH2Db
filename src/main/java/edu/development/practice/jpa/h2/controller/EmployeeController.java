package edu.development.practice.jpa.h2.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.development.practice.jpa.h2.entity.Employee;
import edu.development.practice.jpa.h2.service.EmployeeService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class EmployeeController {
	
	private final EmployeeService employeeService;
	
	@PostMapping(value = "/get/new")
	public ResponseEntity<Employee> newEmployee(@RequestBody Employee request) {
		return new ResponseEntity<>(employeeService.saveEmployee(request), HttpStatus.OK);
	}
	
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<Employee> getById(@PathVariable(value = "id") String id) {
		return new ResponseEntity<>(employeeService.getEmployeeDetails(id), HttpStatus.OK);
	}
	
	@GetMapping(value = "/get/all")
	public ResponseEntity<List<Employee>> getById() {
		return new ResponseEntity<>(employeeService.getEmployee(), HttpStatus.OK);
	}

}
