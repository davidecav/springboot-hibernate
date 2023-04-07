package com.springboot.davide.dao;

import java.util.List;

import com.springboot.davide.model.Employee;

public interface EmployeeDao {
	
	List<Employee> get();
	
	Employee get(int id);

	void save(Employee employee);
	
	void delete(int id);
}
