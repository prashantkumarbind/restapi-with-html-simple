package com.pksoftware;

import org.springframework.beans.factory.annotation.Autowired;
import com.pksoftware.entity.Student;
import com.pksoftware.option.Option;
import com.pksoftware.service.StudentService;
import com.pksoftware.serviceimpl.StudentServiceImpl;


public class App 
{
	static Option option;
	static StudentService studentService;
    public static void main( String[] args )
    {
    	  option = new Option();
    	  studentService = new StudentServiceImpl();
          int result;
          while(true)
          {
        	   result = option.option();
        	   switch(result)
        	   {
        	   		case 1: studentService.save();
        	   				break;
        	   		case 2: studentService.getAll();
        	   				break;
        	   		case 3: studentService.getById();
        	   				break;
        	   		case 4: studentService.delete();
        	   				break;
        	   		case 5: studentService.update();
        	   				break;
        	   		case 6: System.exit(0);
        	   				break;
        	   		default : System.out.println("Please Select Current Option::");
        	   }
          }
    
    }
}
