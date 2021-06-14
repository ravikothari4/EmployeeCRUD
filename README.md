# EmployeeCRUD
DB Conf:

version: MySQL 8

DB name: students

Table creation query:

CREATE TABLE employee (empid INT PRIMARY KEY, empname VARCHAR(25), department VARCHAR(15), salary INT);

Employee insertion JSON for Postman:

{
	"empid":"1",
	"empname":"Some Employee",
	"department":"Some Department",
	"salary":"10000"
}

Services:

1. Add/Post Employee:    localhost:8080/employee

2. Delete Employee:    localhost:8080/employee/{empid}

3. Edit Employee:    localhost:8080/employee

4. List Employee:    localhost:8080/employee/{empid}

5. List All Employee:    localhost:8080/employees

6. Delete All Employees:    localhost:8080/employees/all
