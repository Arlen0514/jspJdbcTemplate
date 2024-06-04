package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	//create
	void addEmployee(Employee e);
	
	//read
	List<Employee> selectAll();
	Employee employeeLogin(String username,String password);
	boolean selectByUsername(String username);
	Employee selectById(int id);
	
	//update
	
	void updateEmployee(int id,String name,String password,String address,String phone);
	
	//delete
	
	void deleteById(int id);
	

}