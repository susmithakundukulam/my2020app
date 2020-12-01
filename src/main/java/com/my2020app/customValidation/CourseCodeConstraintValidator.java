package com.my2020app.customValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements
		ConstraintValidator<CourseCode, String>{
	
	private String courseConstPrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		courseConstPrefix = theCourseCode.value();
	}

	@Override
	public boolean isValid(String theInputCode, ConstraintValidatorContext context) {
		
		boolean result; 
		if(theInputCode != null) {
		result = theInputCode.startsWith(courseConstPrefix);		
		}else {
			result=false;
		}
		return result;
	}

}
