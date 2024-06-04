package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeDao {
	//create
	void add(Employee e);
	
	//read
	List<Employee> queryAll();
	List<Employee> queryEmployee(String username,String password);
	List<Employee> queryUsername(String username);
	List<Employee> queryById(int id);
	
	//update
	void update(Employee e);
	
	
	//delete
	void delete(int id);
	

}