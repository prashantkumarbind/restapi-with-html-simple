package com.pksoftware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.pksoftware.entity.Employee;

public class App 
{

	/*
	 * @Autowired static JdbcTemplate template;
	 */
	
	/*
	 * @Autowired(required = true) static Employee emp;
	 */
	static String sql;
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/pksoftware/xml/XmlConfigure.xml");
    	JdbcTemplate template = (JdbcTemplate)context.getBean("template", JdbcTemplate.class);
    	AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("com/pksoftware/xml/XmlConfigure.xml");
    	Employee emp = (Employee)context1.getBean("employee", Employee.class);
    	
    	
    	
    	
    	sql = "insert into employee1 values(?,?,?)";
    	int result = template.update(sql, emp.getName(),emp.getAddress(),emp.getSalary());
    	if(result==1)
    		 System.out.println("data successfully update.....");
    	else
    		System.out.println("data not store in database......");
    	
    }
}
