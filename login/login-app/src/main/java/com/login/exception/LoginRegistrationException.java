package com.login.exception;

public class LoginRegistrationException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public LoginRegistrationException(){
		super();
	}
	
	public LoginRegistrationException(Throwable cause){
		super(cause);
	}
	
	public LoginRegistrationException(String message) {
		super(message);
	}
	
	public LoginRegistrationException(String message, Throwable cause) {
		super(message, cause);
	}

}
