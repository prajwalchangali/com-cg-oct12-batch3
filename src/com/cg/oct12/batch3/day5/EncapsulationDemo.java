package com.cg.oct12.batch3.day5;

public class EncapsulationDemo {
	public static void main(String[] args) {
		
		Employee e= new Employee();
		System.out.println(e.getsalary());
		e.setsalary(10000.0);
		System.out.println(e.getsalary());
		e.setEid(101);
		e.setFirstName("praj");
		System.out.println(e.getEid());
		System.out.println(e.getFirstName());
		System.out.println(e.toString());
		
	}

}
