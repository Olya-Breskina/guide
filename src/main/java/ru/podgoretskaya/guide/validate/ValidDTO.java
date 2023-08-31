package ru.podgoretskaya.guide.validate;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {DTOValidator.class})
public @interface ValidDTO {
    Class<? extends Payload> [] payload() default{};
    Class<?>[] groups() default {};
    String message() default "проверь запрос";
}
