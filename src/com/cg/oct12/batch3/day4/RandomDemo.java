package com.cg.oct12.batch3.day4;

import java.util.Random;
public class RandomDemo {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		int i= r.nextInt();
		System.out.println(i);
		int j=r.nextInt(100);
		System.out.println(j);
		
	}
	

}
