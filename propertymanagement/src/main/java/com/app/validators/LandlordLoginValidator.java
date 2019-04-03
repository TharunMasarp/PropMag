package com.app.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.app.beans.LandlordRegistration;

public class LandlordLoginValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return LandlordRegistration.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "landlordId", "landlordId.required", "User id field should not be empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password.required", "please enter password");
	}

}
