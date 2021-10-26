package com.cg.oct12.batch3.day5.abs;

abstract class Rbi {

	abstract void doKyc(); 

	void openAccount() {
	}

	void payLoans() {
	}
}

class HdfcBank extends Rbi {

	@Override
	void doKyc() {
		System.out.println("Aadhaar");
	}

}

class IciciBank extends Rbi {

	@Override
	void doKyc() {
		System.out.println("PAN CARD");
		
	}


}

public class App {
	public static void main(String[] args) {

		HdfcBank obj = new HdfcBank();
		obj.doKyc();
		IciciBank obj2 = new IciciBank();
		obj2.doKyc();
	}
}

