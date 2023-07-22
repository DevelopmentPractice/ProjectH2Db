package edu.development.practice.jpa.h2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employee_tb1")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empId;
	
	private String name;
	
	@Column(name = "first_name")
	private String firstName;
	
	private String deptId;
	
	private String dname;

	public Employee(String name, String firstName, String deptId, String dname) {
		super();
		this.name = name;
		this.firstName = firstName;
		this.deptId = deptId;
		this.dname = dname;
	}

}
