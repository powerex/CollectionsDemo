package ua.edu.npu.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface RuntimeAnnotation {
    String description() default "Default description";
    int value() default 0;
}