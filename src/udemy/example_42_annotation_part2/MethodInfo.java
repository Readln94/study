package udemy.example_42_annotation_part2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    String author();
    int dateOfCreation() default 2020;
    String purpose();
}
