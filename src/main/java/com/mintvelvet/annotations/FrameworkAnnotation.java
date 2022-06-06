package com.mintvelvet.annotations;


import com.mintvelvet.enums.CategoryType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 */



@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface FrameworkAnnotation {

    String[] Author() default "";
    String Tag() default "";
    CategoryType[] Category() default {CategoryType.REGRESSION} ;
}
