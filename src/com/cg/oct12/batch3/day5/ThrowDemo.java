package com.cg.oct12.batch3.day5;

import java.util.Scanner;

public class ThrowDemo {
	public static void checkEligiblity(int x) {
		if(x<=18) {
			throw new CannotVoteException("cant vote");
		}
		else {
			System.out.println("vote for india");
		}
	}
	public static void main(String[] args) {
		
		int n;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter age");
		n=sc.nextInt();
		checkEligiblity(n);
	}


}
