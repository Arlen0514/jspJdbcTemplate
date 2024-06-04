package com.example.demo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;
@Component
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired//呼叫bean
	private JdbcTemplate jdbctemplate;//new 
	
	
	@Override
	public void add(Employee e) {
		String SQL="insert into employee(employeeno,name,username,password,address,phone) "
				+ "values(?,?,?,?,?,?)";
		
		jdbctemplate.update(SQL,
				e.getEmployeeno(),
				e.getName(),
				e.getUsername(),
				e.getPassword(),
				e.getAddress(),
				e.getPhone());
		
	}


	@Override
	public List<Employee> queryAll() {
		String SQL="select * from Employee";
		List<Employee> l=jdbctemplate.query(SQL, new BeanPropertyRowMapper(Employee.class));
		
		return l ;
	}


	@Override
	public List<Employee> queryEmployee(String username, String password) {
		String SQL="select * from Employee where username=? and password=?";
		List<Employee> l=jdbctemplate.query(SQL, new BeanPropertyRowMapper(Employee.class),username,password);
		
		
		return l;
	}


	@Override
	public List<Employee> queryUsername(String username) {
		String SQL="select * from Employee where username=?";
		List<Employee> l=jdbctemplate.query(SQL, new BeanPropertyRowMapper(Employee.class),username);
		
		
		return l;
	}


	@Override
	public List<Employee> queryById(int id) {
		String SQL="select * from Employee where id=?";
		List<Employee> l=jdbctemplate.query(SQL, new BeanPropertyRowMapper(Employee.class),id);
		
		
		return l;
	}


	@Override
	public void update(Employee e) {
		String sql="update employee set name=?,password=?,address=?,phone=? where id=?";
		jdbctemplate.update(sql,e.getName(),e.getPassword(),e.getAddress(),e.getPhone(),e.getId());
		
		
	}


	@Override
	public void delete(int id) {
		String sql="delete from employee where id=?";
		jdbctemplate.update(sql,id);
		
	}


	

}