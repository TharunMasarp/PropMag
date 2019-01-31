package com.app.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.app.beans.RenterRegistration;

public class RenterRegValidator implements Validator {

	
	
	@Override
	public boolean supports(Class<?> clazz) {
		return RenterRegistration.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "firstName.required", "First Name field is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "lastName.required", "Last Name field is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "location", "location.required", "Location field is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mobile", "mobile.required", "Mobile field is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "email.required", "Email field is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password.required", "Password field is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "cPassword", "cPassword.required", "Confirm Password field is required");
	}

}
