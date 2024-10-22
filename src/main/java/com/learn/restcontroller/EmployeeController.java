package com.learn.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learn.model.Employee;
import com.learn.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	// for save data into db
	// http://localhost:8081/employee/saveEmployee
	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employee employee)// @RequestBody
																// Annotation is
																// used to
																// convert data
																// from JSON
																// Object
	{

		// System.out.println(employee);
		/*
		 * System.out.println(employee.getEmpCode());
		 * System.out.println(employee.getEmpAddress());
		 * System.out.println(employee.getEmpDepartment());
		 * System.out.println(employee.getEmpName());
		 * System.out.println(employee.getEmpPhone());
		 * System.out.println(employee.getEmpSalary());
		 * System.out.println(employee.getEmpStatus());
		 */

		System.out.println("EmployeeController--->saveEmployee--->Staring...");

		employeeService.saveEMployee(employee);

		System.out.println("EmployeeController--->saveEmployee--->END.");

		return "Saved Employee Successfully!";

	}

	// get all employee
	// http://localhost:8081/employee/getAllEmployee
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployees() {
		System.out.println("EmployeeController--->getAllEmployees--->Staring...");

		List<Employee> allEmployee = employeeService.getAllEmployee();

		System.out.println("EmployeeController--->getAllEmployees--->END...");
		return allEmployee;
	}

	// get single employee
	// http://localhost:8081/employee/getEmployee/101

	@GetMapping("/getEmployee/{empCode}")
	public Employee getEmployee(@PathVariable Integer empCode) {
		return employeeService.getEmployee(empCode);
	}

	// get single employee with query parameter
	// http://localhost:8081/employee/getEmployee?empCode=101

	@GetMapping("/getEmployee")
	public Employee getEmployeeByQueryParamter(@RequestParam Integer empCode) {
		System.out.println("EmployeeController--->getEmployeeByQueryParamter---->Staring");
		Employee employee = employeeService.getEmployee(empCode);

		System.out.println("EmployeeController--->getEmployeeByQueryParamter---->END");

		return employee;
	}
	
	
	// Delete single employee
		// http://localhost:8081/employee/deleteEmployee/101
	
	@DeleteMapping("/deleteEmployee/{empCode}")
	public String delteEmployee(@PathVariable Integer empCode)
	{
		employeeService.deleteEmployee(empCode);
		
		return "Employee Deleted Successfully! ";
		
	}
	
	
	@DeleteMapping("/deleteAllEmployee")
	public String deleteAllEmployee()
	{
		employeeService.deleteAllEmployee();
		
		return "Deleted All Employee!";
	}
	

}
