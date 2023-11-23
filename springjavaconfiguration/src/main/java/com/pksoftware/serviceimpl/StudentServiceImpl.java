package com.pksoftware.serviceimpl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.pksoftware.entity.Student;
import com.pksoftware.javaconfig.JavaConfiguration;
import com.pksoftware.rowmapper.RowMapperConcept;
import com.pksoftware.service.StudentService;


@Component
public class StudentServiceImpl implements StudentService{

	JavaConfiguration ob1 = new JavaConfiguration();
	JdbcTemplate jdbcTemplate = ob1.getJdbcTemplateObject();
	
	String sql;
	int id;
	Student std = new Student();
	BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
	public void save() {
		System.out.println("Save.......................");
	    sql = "select * from spring_student";
		List<Student> list =  jdbcTemplate.query(sql, new RowMapperConcept());
		for(Student std : list)
		{
			 id = std.getRoll();
		}
		System.out.println("First Roll Number::"+id);
		id++;
		System.out.println("Second Roll Number::"+id);
		try {
				System.err.print("Enter the Name");
				std.setName(bfr.readLine());
				System.err.print("Enter the Fees");
				std.setFees(Float.parseFloat(bfr.readLine()));
				std.setRoll(id);
				
			    sql = "insert into spring_student(name,roll,fees) values(?,?,?)";
			    int result = jdbcTemplate.update(sql, std.getName(), std.getRoll(), std.getFees());
			    if(result==1)
			    	System.out.println("Store Success.............");
			    else
			    	System.out.println("not Store..............");
				
		}catch(Exception e) {
			System.out.println("Exception Occure in StudentServiceImpl class save method::"+e);
		}
	}

	public void getAll() {
		System.out.println("getAll.......................");
		sql = "select * from spring_student";
		List<Student> student = jdbcTemplate.query(sql, new RowMapperConcept());
		for(Student s : student)
		{
			   System.err.println(student);
		}
		
	}

	public void getById() {
		System.out.println("getById.......................");
		try {
				System.err.print("\n Enter the Roll::..........::");
				id = Integer.parseInt(bfr.readLine());
				sql = "select * from spring_student where roll="+id;
				List<Student> student = jdbcTemplate.query(sql, new RowMapperConcept());
				System.err.println(student);
		}catch(Exception e){
			 e.getStackTrace();
		}
		
	}

	public void update() {
		boolean rs=false;
		System.out.println("update.......................");
		try {
			  System.out.print("\nEnter the roll number you want to update ::");
			  id = Integer.parseInt(bfr.readLine());
			  sql = "select * from spring_student where roll="+id;
			  List<Student> list = jdbcTemplate.query(sql, new RowMapperConcept());
			  for(Student s : list)
			  {
				    if(id == s.getRoll())
				    {
				    	 rs = true;
				    	 break;
				    }else
				    	continue;
				   
			  }
			  if(rs==true)
			  {
				  System.err.print("\n Enter Name ::");
				  String name = bfr.readLine();
				  sql = "update spring_student set name="+name+" where roll="+id;
				  int result = jdbcTemplate.update(sql);
				  if(result==1)
					  System.out.println("Update Successfully Done...");
				  else
					  System.out.println("Data Not Update ...");
			  }else
				   System.out.println("Roll Number not Exist.................");
		}catch(Exception e) {
			e.getStackTrace();
		}
		
	}

	public void delete() {
		System.out.println("delete.......................");
		try {
			  System.out.print("\n Enter the roll::");
			  id = Integer.parseInt(bfr.readLine());
			  sql = "delete from spring_student where roll="+id;
			  int result = jdbcTemplate.update(sql);
			  if(result==1)
				   System.out.println("Data delete Successfully");
			  else
				  System.out.println("Data Not Deleted.....");
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
}
