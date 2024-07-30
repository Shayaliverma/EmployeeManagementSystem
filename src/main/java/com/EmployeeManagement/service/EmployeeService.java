package com.EmployeeManagement.service;

import java.util.List;

import com.EmployeeManagement.entity.Employee;

public interface EmployeeService {
	List<Employee> getAllEmplyee();
	void saveEmployee(Employee employee);
	
	Employee getEmployeeById(long id);
	
	void deleteEmployee(long id);
}


