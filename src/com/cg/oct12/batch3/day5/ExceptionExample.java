package com.cg.oct12.batch3.day5;

import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two numbers a and b :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException ae) {
			System.out.println("do not use number zero");
		}
		finally {
			System.out.println("end");
		}
		
	}

}
