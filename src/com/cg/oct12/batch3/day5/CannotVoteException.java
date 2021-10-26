package com.cg.oct12.batch3.day5;

public class CannotVoteException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	 CannotVoteException() {
		super();
	
	}

	public CannotVoteException(String message) {
		super(message);
		
	}

}
