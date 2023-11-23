package com.pksoftware.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

		private String name;
		@Id
		@GeneratedValue(strategy =GenerationType.IDENTITY)
		private int roll;
		private float fees;
		private String email;
		private String address;
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRoll() {
			return roll;
		}
		public void setRoll(int roll) {
			this.roll = roll;
		}
		public float getFees() {
			return fees;
		}
		public void setFees(float fees) {
			this.fees = fees;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", roll=" + roll + ", fees=" + fees + ", email=" + email + ", address="
					+ address + "]";
		}
		
		
}
