package com.cg.oct12.batch3.day4;

public class Employee {
	int empid;
	String name;
	double sal;
	public Employee() {
		
	}
	public Employee(int empid,String name, double sal) {
		super();
		this.empid =empid;
		this.name=name;
		this.sal=sal;
		
	}
	@Override
	public String toString() {
		return "Employee [eid=" + empid + ", name=" + name + ", salary=" + sal + "]";
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empid=101;
		e.name="praj";
		e.sal=2000.00;
//		System.out.println(e.empid+" "+e.name+" "+e.sal);
		System.out.println(e.toString());
		
		Employee e2=new Employee(102,"rock",2000.01);
//		System.out.println(e2.empid+" "+e2.name+" "+e2.sal);
		System.out.println(e2.toString());
	
}

}
