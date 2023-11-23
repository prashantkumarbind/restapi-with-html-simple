package com.pksoftware.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pksoftware.dao.EmployeeDao;
import com.pksoftware.entity.Employee;
import com.pksoftware.service.EmployeeService;


@Component
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao dao;
	
	@Override
	public void save(Employee employee) {
		
			Employee employee2 = dao.save(employee);
			System.out.println(employee2);
	}

		
}
