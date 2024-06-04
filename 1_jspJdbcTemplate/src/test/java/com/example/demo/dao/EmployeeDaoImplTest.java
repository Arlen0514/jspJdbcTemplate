package com.example.demo.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dao.impl.EmployeeDaoImpl;
import com.example.demo.model.Employee;
@SpringBootTest
public class EmployeeDaoImplTest {
	@Autowired
	EmployeeDaoImpl em;
	//@Test
	public void addTest()
	{
		Employee e=new Employee("sad","aff","daff","1354","taipei","0123456789");
		em.add(e);
		System.out.println("success");
		
	}
	//@Test
	public void queryTest()
	{
		System.out.println(em.queryEmployee("daff","1354"));
		System.out.println("query test success");
	}
	@Test
	public void update_deleteTest()
	{
		//em.delete(4);
		Employee[] e=em.queryById(5).toArray(new Employee[1]);
		System.out.println(e[0].getName()+"\t"+e[0].getUsername());
		//e[0].setName("tta");
		//em.update(e[0]);
		
					
		System.out.println("update success");
	}

}
