package com.luv2code.springboot.crudTable.service;

import java.util.List;

import com.luv2code.springboot.crudTable.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();
	
	Employee findById(int theId);
	
	void save(Employee theEmployee);
	
	void deleteById(int theId);
	
}
