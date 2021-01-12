package com.my2020app.controllerImpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my2020app.controller.EmployeeRestController;
import com.my2020app.domain.ResponseMessage;
import com.my2020app.error.EmployeeErrorResponse;
import com.my2020app.error.EmployeeNotFoundException;
import com.my2020app.model.Employee;

@Controller
public class EmployeeRestControllerImpl implements EmployeeRestController{
	
	
	
	public List<Employee> employees = new ArrayList<Employee>();

//	@ExceptionHandler
//	public ResponseEntity<EmployeeErrorResponse> handleException(EmployeeNotFoundException exc){
//		EmployeeErrorResponse error = new EmployeeErrorResponse();
//		error.setStatus(HttpStatus.NOT_FOUND.value());
//		error.setMessage(exc.getMessage());
//		error.setTimestamp(System.currentTimeMillis());
//		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
//	}
	
	@ExceptionHandler
	public ResponseEntity<EmployeeErrorResponse> handleException(Exception exc){
		EmployeeErrorResponse error = new EmployeeErrorResponse();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exc.getMessage());
		error.setTimestamp(System.currentTimeMillis());
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	@PostConstruct
	public List<Employee> employees(){
		employees.add(new Employee("Sus", "Tom"));
		employees.add(new Employee("Tom", "Anto"));
		employees.add(new Employee("Chris", "Tom"));
		return employees;
	}

	@Override
	public ResponseMessage getEmployeeList() {
		System.out.println("..........getEmployeeList..........");
		ResponseMessage response=new ResponseMessage();
//		List<Employee> employees = new ArrayList<Employee>();
//		employees.add(new Employee("Sus", "Tom"));
//		employees.add(new Employee("Tom", "Anto"));
//		employees.add(new Employee("Chris", "Tom"));

		response.addPayload("employeeList", employees);
		return response;
	}

	@Override
	public ResponseMessage getEmployeeListById(@PathVariable Integer empId) {
		System.out.println("..............................." +empId);
		ResponseMessage response=new ResponseMessage();
		
		if(empId >= employees.size() || empId < 0) {
			throw new EmployeeNotFoundException("Employee Id not found : " + empId);
		}
		response.addPayload("result", employees.get(empId));
		return response;
	}


}
