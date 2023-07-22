package edu.development.practice.jpa.h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.development.practice.jpa.h2.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
