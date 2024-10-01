package dev.gustavorh.crudjpa.validations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = ExistsUsernameValidation.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExistsUsername {
    String message() default "ya existe en nuestros registros...";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
