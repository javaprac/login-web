package com.login.entities;

import java.io.Serializable;

public class ServiceStatus implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String statusCode;
	private String description;
	
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
