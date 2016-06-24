package com.test.controller;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.test.model.Person;

@Component
public class PersonValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return Person.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		Person person = (Person) target;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pno", "pno.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fname", "fname.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lname", "lname.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "city", "city.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "address.required");
		
		if(person.getPno() < 500)
		{
			errors.rejectValue("pno", "pno.min"); //error key "fee.min
		}
	}

}
