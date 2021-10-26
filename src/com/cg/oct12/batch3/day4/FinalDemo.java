package com.cg.oct12.batch3.day4;

public class FinalDemo {
	
	private static final int num=10;
	private static int num2=20;
	
	public static void main(String[] args) {
		final int num3=30;
		System.out.println(FinalDemo.num);
		num2=30;
		System.out.println(num2);
		System.out.println(num3);
		
		
	}


}
