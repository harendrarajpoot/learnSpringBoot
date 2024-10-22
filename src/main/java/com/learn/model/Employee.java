package com.learn.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

// it is map the class with your database tablename
@Entity
public class Employee {
// @ID annotion is used to create as primary key in your table
	@Id
	private int empCode;
	private String empName;
	private String empPhone;
	private String empAddress;
	private String empStatus;
	private String empDepartment;
	private float empSalary;
	
	
	

}
