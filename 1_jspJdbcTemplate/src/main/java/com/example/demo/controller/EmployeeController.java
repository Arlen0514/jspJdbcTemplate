package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.impl.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeServiceImpl esi;
	@RequestMapping("add1")
	public String add1(String employeeno,String name,String username,String password,String address,String phone)
	{
		Employee e=new Employee(employeeno,name,username,password,address,phone);
		esi.addEmployee(e);
		
		return "建檔成功";
		
	}
	@GetMapping("add2")
	public String add2(String employeeno,String name,String username,String password,String address,String phone)
	{
		Employee e=new Employee(employeeno,name,username,password,address,phone);
		esi.addEmployee(e);
		
		return "建檔成功";
		
	}
	@GetMapping("selectAll")
	public List<Employee> getAll()
	{
		return esi.selectAll();
		
	}
	@PostMapping("EmployeeLogin")
	public Employee getEmployee(String username,String password)
	{
		return esi.employeeLogin(username, password);
	}
	
	@PostMapping("updateEmployee")
	public String update(int id,String name,String password,String address,String phone)
	{
		
		esi.updateEmployee(id, name, password, address, phone);
		return "修改成功";
	}
	@PostMapping("delete")
	public String deleteEmployee(int id)
	{
		esi.deleteById(id);
		return "刪除成功";
	}


}
