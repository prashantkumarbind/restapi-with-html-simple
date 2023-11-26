package com.pksoftware.entity;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component(value="employee")
@ComponentScan(basePackages = "com.pksoftware.entity")
public class Employee {

		private String name;
		private String address;
		private float salary;
		
		
		public Employee() {
			System.out.println("Employee non parameterized constructor...");
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + "]";
		}
		
		
		
}
