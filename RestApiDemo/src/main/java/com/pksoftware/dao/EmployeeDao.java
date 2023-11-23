package com.pksoftware.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pksoftware.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

		
}
