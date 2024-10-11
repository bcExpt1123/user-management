package com.usermanagement.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {

    @Override
    public void initialize(PhoneNumber constraintAnnotation) {
    }

    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext context) {
        // Regex for phone number (example: (123) 456-7890 or 123-456-7890 or 1234567890)
        return phoneNumber != null && phoneNumber.matches("^(\\+\\d{1,3}[- ]?)?\\d{10}$");
    }
}
