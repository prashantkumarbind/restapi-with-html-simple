package com.pksoftware.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {

		private String name;
		private int roll;
		private float fees;
		
		
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
		
		public String toString() {			
			   return "\n Student \n Name::"+name+"\n Roll::"+roll+"\n Fees::"+fees;
		}
}
