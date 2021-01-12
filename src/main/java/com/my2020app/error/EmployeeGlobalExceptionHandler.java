package com.my2020app.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeGlobalExceptionHandler {
	
   @ExceptionHandler
   public ResponseEntity<EmployeeErrorResponse> handleException(EmployeeNotFoundException exc){
	   
	   EmployeeErrorResponse error = new EmployeeErrorResponse();
	   error.setStatus(HttpStatus.BAD_REQUEST.value());
	   error.setMessage(exc.getMessage());
	   error.setTimestamp(System.currentTimeMillis());
	 
	   return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
   }
}
