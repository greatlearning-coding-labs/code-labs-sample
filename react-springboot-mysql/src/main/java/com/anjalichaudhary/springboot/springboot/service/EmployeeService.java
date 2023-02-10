package com.anjalichaudhary.springboot.springboot.service;

import java.util.List;

import com.anjalichaudhary.springboot.springboot.modal.Employee;

public interface EmployeeService {
	

	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
	

}
