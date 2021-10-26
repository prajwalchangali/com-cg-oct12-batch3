package com.cg.oct12.batch3.day5.inheritence;

public class MtDemo extends Thread {
	
	public void myloop() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	public void run() {
		this.myloop();
	}
	public static void main(String[] args) {
		MtDemo a=new MtDemo();
		a.start();
		MtDemo b= new MtDemo();
		b.start();
//		MtDemo c= new MtDemo();
//		c.myloop();
	}

}
