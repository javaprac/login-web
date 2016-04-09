package com.login.initialization;

public class WebAppInitializationException extends Exception {

	private static final long serialVersionUID = 1L;

	public WebAppInitializationException(){
		super();
	}
	
	public WebAppInitializationException(Throwable cause){
		super(cause);
	}
	
	public WebAppInitializationException(String message) {
		super(message);
	}
	
	public WebAppInitializationException(String message, Throwable cause) {
		super(message, cause);
	}
}
