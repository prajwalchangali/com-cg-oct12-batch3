package com.cg.oct12.batch3.day5.inheritence;

public class MtDemo2 implements Runnable {
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

	@Override
	public void run() {
		this.myloop();
	}
	public static void main(String[] args) {
		Thread a=new Thread (new MtDemo2());
		a.start();
		Thread b=new Thread (new MtDemo2());
		b.start();
//		MtDemo c= new MtDemo();
//		c.myloop();
	}

}
