package com.app.validators;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.app.beans.LandlordRegistration;

public class LandlordRegValidator implements Validator {
	
	public boolean supports(Class<?> clazz){
		return LandlordRegistration.class.equals(clazz);
	}
	
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "firstName.required", "First Name filed is required" );
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "lastName.required", "Last Name filed is required" );
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", "gender.required", "gender filed is required" );
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "city", "city.required", "City filed is required" );
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mobile", "mobile.required", "Mobile filed is required" );
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "email.required", "Email filed is required" );
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password.required", "Password filed is required" );
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "cPassword", "cPassword.required", "Confirm Password filed is required" );
		
	}
	
}
