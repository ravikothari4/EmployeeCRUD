package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	//creating a get mapping that retrieves all the employees' detail from the database 
	@GetMapping("/employees")
	private List<Employee> getAllEmployees() 
	{
		return employeeService.getAllEmployees();
	}
	
	//creating a get mapping that retrieves the detail of a specific employee
	@GetMapping("/employee/{empid}")
	private Employee getBooks(@PathVariable("empid") int empid) 
	{
		return employeeService.getEmployeeById(empid);
	}
	
	//creating a delete mapping that deletes a specified employee
	@DeleteMapping("/employee/{empid}")
	private void deleteEmployee(@PathVariable("empid") int empid) 
	{
		employeeService.delete(empid);
	}
	
	//creating post mapping that post the employee detail in the database
	@PostMapping("/employee")
	private int saveEmployee(@RequestBody Employee employee) 
	{
		employeeService.saveOrUpdate(employee);
		return employee.getEmpid();
	}
	
	//creating put mapping that updates the employee detail 
	@PutMapping("/employee")
	private Employee update(@RequestBody Employee employee) 
	{
		employeeService.saveOrUpdate(employee);
		return employee;
	}
	
	//creating a delete mapping that deletes all employees
	@DeleteMapping("/employees/all")
	private void deleteAllEmployees() 
	{
		employeeService.deleteAll();
	}
}
