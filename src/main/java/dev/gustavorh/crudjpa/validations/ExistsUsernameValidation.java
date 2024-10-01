package dev.gustavorh.crudjpa.validations;

import dev.gustavorh.crudjpa.services.UserService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class ExistsUsernameValidation implements ConstraintValidator<ExistsUsername, String> {
    @Autowired
    private UserService userService;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {
        return !userService.existsByUsername(username);
    }
}
