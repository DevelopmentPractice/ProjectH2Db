package edu.development.practice.jpa.h2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.development.practice.jpa.h2.entity.Employee;
import edu.development.practice.jpa.h2.service.EmployeeService;

@SpringBootApplication
public class JpaH2Application implements CommandLineRunner {
	
	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(JpaH2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeeService.saveEmployee(new Employee("Angel", "Martinez", "1", "Informatica"));
	}

}
