package com.my2020app.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.my2020app.customValidation.CourseCode;

public class Student {
	private String firstName;
	
	@NotNull(message="is required...")
	@Size(min = 1, message="is required...")
	private String lastName;
	
	@NotNull(message="is required...")
	@Min(value=0, message = "must be greater than or equal to zero")
	@Max(value=10, message = "must be less than or equal to 10")
	private Integer freePasses;
	
	@CourseCode()
	private String courseCode;

	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	

}
