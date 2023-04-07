package com.springboot.davide.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.davide.model.Employee;

import jakarta.persistence.EntityManager;


@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Employee> get() {

		Session currentSession = entityManager.unwrap(Session.class);
		Query<Employee> query= currentSession.createQuery("from Employee",Employee.class);
		List<Employee> list = query.getResultList();
		return list;

	}

	@Override
	public Employee get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Employee employeeObj = currentSession.get(Employee.class,id);
		
		return employeeObj;
	}

	@Override
	public void save(Employee employee) {

		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(employee);

	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Employee employeeObj = currentSession.get(Employee.class,id);		
		currentSession.delete(employeeObj);
	}

}
