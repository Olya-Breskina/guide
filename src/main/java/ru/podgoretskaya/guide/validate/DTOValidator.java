package ru.podgoretskaya.guide.validate;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import ru.podgoretskaya.guide.dto.InformationAboutVehicleDTO;

import java.util.List;

public class DTOValidator  implements ConstraintValidator<ValidDTO, InformationAboutVehicleDTO> {
    @Override
    public void initialize(ValidDTO constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(InformationAboutVehicleDTO value, ConstraintValidatorContext context) {
        if (value.getModel()==null){
            context.buildConstraintViolationWithTemplate("model").addConstraintViolation();
            return false;
            //throw  new DTOinvalidExeption(List.of("model"));
        }
        return true;
    }
}
