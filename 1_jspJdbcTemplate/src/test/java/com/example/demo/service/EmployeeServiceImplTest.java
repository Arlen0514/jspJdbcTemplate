package com.example.demo.service;

import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Employee;
import com.example.demo.service.impl.EmployeeServiceImpl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
public class EmployeeServiceImplTest {
  @Autowired
  EmployeeServiceImpl esi;
  //@Test
  public void EmployeeServiceTest()
  {
	  Employee e=new Employee("e004","tt","oo","0000","taipei","456");
		esi.addEmployee(e);
		
		System.out.println("Test Success");
  }
  @Test
  public void updateTest()
  {
	  System.out.println(esi.selectById(1));
	  System.out.println("update test success");
	  
  }

}
