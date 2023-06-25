package org.training.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = NotLoremIpsumValidator.class)
@Documented
public @interface NotLoremIpsum {
    String message() default "Should not include lorem ipsum";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
