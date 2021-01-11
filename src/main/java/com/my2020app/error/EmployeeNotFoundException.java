package com.my2020app.error;

public class EmployeeNotFoundException extends RuntimeException{

	public EmployeeNotFoundException(String message) {
		super(message);
	}
   
}
