package com.cg.oct12.batch3.day5;

public class Employee {
	
		private int eid;
		private String firstName;
		private double salary=8000.00;
		
		
		
		public Employee() {
			super();
		}
		
		
		public Employee(int eid, String firstName, double salary) {
			super();
			this.eid = eid;
			this.firstName = firstName;
			this.salary = salary;
		}


		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public double getsalary() {
			return this.salary;
		}
		public void setsalary(double salary) {
			this.salary=salary;
			
		}
		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + "]";
		}

}
