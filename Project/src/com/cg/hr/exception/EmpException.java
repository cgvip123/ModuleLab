package com.cg.hr.exception;

public class EmpException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmpException( String message, Throwable cause) {
		// TODO Auto-generated constructor stub
		super(message,cause);
	}
	
	public EmpException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
