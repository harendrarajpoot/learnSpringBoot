package com.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.model.Employee;
import com.learn.repo.EmployeeRepository;


@Service
public class EmployeeService {
	
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void saveEMployee(Employee employee)
	{
		System.out.println("EmployeeService--->saveEMployee--->staring");
		
		employeeRepository.save(employee);// save database into database 
		
		System.out.println("EmployeeService--->saveEMployee--->END");
		
	}
	
	public List<Employee> getAllEmployee()
	{
		return employeeRepository.findAll();/// fetch all data from database
	}

	
	public Employee getEmployee(int empCode)
	{
		System.out.println("EmployeeService--->getEmployee--->staring");
		Employee employee = employeeRepository.findById(empCode).get();// fetch data single object from db
		System.out.println("EmployeeService--->getEmployee--->ENd");
		
		 return employee;
	}
	
	public void deleteEmployee(int empCode)
	{
		employeeRepository.deleteById(empCode);// delete one object from db based on id
	}
	
	public void deleteAllEmployee()
	{
		employeeRepository.deleteAll();// delete all the record the from db
	}
}

