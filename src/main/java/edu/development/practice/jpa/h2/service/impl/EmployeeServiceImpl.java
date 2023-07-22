package edu.development.practice.jpa.h2.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.development.practice.jpa.h2.entity.Employee;
import edu.development.practice.jpa.h2.repository.EmployeeRepository;
import edu.development.practice.jpa.h2.service.EmployeeService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
	
	private final EmployeeRepository employeeRepository;

	@Override
	public Employee getEmployeeDetails(String empId) {
		return employeeRepository.findById(Long.parseLong(empId)).orElseThrow(() -> new RuntimeException("No se encontro el Registro"));
	}

	@Override
	public List<Employee> getEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee request) {
		return employeeRepository.save(request);
	}

}
