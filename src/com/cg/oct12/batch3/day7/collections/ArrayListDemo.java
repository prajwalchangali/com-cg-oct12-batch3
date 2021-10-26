package com.cg.oct12.batch3.day7.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList nl=new ArrayList();
		System.out.println(nl);
		nl.add(10);
		nl.add(20.5);
		nl.add("abc");
		nl.add('c');
		System.out.println(nl);
		Iterator it= nl.iterator();
		while(it.hasNext())
		System.out.println(it.next());
	}

}
