package com.pksoftware.option;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component
@ComponentScan(basePackages = "com.pksoftware.option")
public class Option {

	   int no;
	   
	   public int option() {
		   	System.out.println("Insert  1");
			System.out.println("GetAll  2");
			System.out.println("GetById 3");
			System.out.println("Delete  4");
			System.out.println("Update  5");
			System.out.println("Exist   6");
			try {
				
				  BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
				  System.err.print("\n Please Select the Any Option::");
				  no = Integer.parseInt(bfr.readLine());
			}catch(Exception e) {
				 e.fillInStackTrace();
			}
		      return no;
	   }
}
