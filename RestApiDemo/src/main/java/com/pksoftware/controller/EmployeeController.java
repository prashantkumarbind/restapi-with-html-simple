package com.pksoftware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pksoftware.entity.Employee;
import com.pksoftware.service.EmployeeService;

@Controller
public class EmployeeController {

		@Autowired
		EmployeeService employeeService;
	
	
		@GetMapping("/save")
		public String index(@ModelAttribute Employee employee) {
			   System.out.println(employee);
			   employeeService.save(employee);
			   return "index.html";
		}
		
		
		@GetMapping("/watch")
		public String show(@ModelAttribute Employee employee) {
			   employeeService.save(employee);	
			   return "index.html";
		}
}
