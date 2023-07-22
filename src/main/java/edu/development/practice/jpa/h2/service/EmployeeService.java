package edu.development.practice.jpa.h2.service;

import java.util.List;

import edu.development.practice.jpa.h2.entity.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee request);
	
	Employee getEmployeeDetails(String empId);
	
	List<Employee> getEmployee();

}
