package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.impl.EmployeeDaoImpl;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeDaoImpl em;
	
	
	@Override
	public void addEmployee(Employee e) {
		em.add(e);
		
	}


	@Override
	public List<Employee> selectAll() {
		
		return em.queryAll();
	}


	@Override
	public Employee employeeLogin(String username, String password) {
		List<Employee> l=em.queryEmployee(username, password);
		Employee[] e=l.toArray(new Employee[1]);
		return e[0];
	}


	@Override
	public boolean selectByUsername(String username) {
		List<Employee> l=em.queryUsername(username);
		boolean x=false;
		if(l.size()!=0) x=true;
		return x;
	}


	@Override
	public Employee selectById(int id) {
		List<Employee> l=em.queryById(id);
		Employee[] e=l.toArray(new Employee[0]);
		
		return e[0];
	}


	@Override
	public void updateEmployee(int id, String name, String password, String address, String phone) {
		Employee e=selectById(id);
		e.setName(name);
		e.setPassword(password);
		e.setAddress(address);
		e.setPhone(phone);
		em.update(e);
		
	}


	@Override
	public void deleteById(int id) {
		em.delete(id);
		
	}

}