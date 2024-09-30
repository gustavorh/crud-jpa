package dev.gustavorh.crudjpa.validations;

import dev.gustavorh.crudjpa.services.ProductService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class ExistsValidation implements ConstraintValidator<IsExistsDb, String> {
    @Autowired
    private ProductService productService;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        return !productService.existsBySku(value);
    }
}
