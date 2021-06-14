package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	//getting all books record by using the method findaAll() of CrudRepository
	public List<Employee> getAllEmployees() 
	{
	List<Employee> employees = new ArrayList<Employee>();
	employeeRepository.findAll().forEach(employee -> employees.add(employee));
	return employees;
	}
	//getting a specific record by using the method findById() of CrudRepository
	public Employee getEmployeeById(int id) 
	{
	return employeeRepository.findById(id).get();
	}
	//saving a specific record by using the method save() of CrudRepository
	public void saveOrUpdate(Employee employees) 
	{
	employeeRepository.save(employees);
	}
	//deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(int id) 
	{
	employeeRepository.deleteById(id);
	}
	//updating a record
	public void update(Employee employees, int empid) 
	{
	employeeRepository.save(employees);
	}
	
	//deleting all employees using deleteAll() method of CrudRepository
	public void deleteAll() {

		employeeRepository.deleteAll();
	}
}
