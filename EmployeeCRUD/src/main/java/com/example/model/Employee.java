package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee
{
	@Id
	@Column
	private int empid;
	
	@Column
	private String empname;
	
	@Column
	private String department;
	
	@Column
	private int salary;
	
	public int getEmpid() {
		return empid;
	}
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public String getEmpname() {
		return empname;
	}
	
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}

}