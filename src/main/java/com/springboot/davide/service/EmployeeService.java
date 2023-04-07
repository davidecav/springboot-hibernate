package com.springboot.davide.service;

import java.util.List;

import com.springboot.davide.model.Employee;

public interface EmployeeService {
	List<Employee> get();
	
	Employee get(int id);

	void save(Employee employee);
	
	void delete(int id);

}
