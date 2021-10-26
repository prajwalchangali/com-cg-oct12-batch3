package com.cg.oct12.batch3.day7.collections;


import java.util.ArrayList;

public class GenericsDemo {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
//		al.add("abc");  // shows error as arraylist only accepts integer type
		al.add(50);
		System.out.println(al);
	}

}
