package com.acme.subcomponents2;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Qualifier;

//@Scope
@Documented
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface NumberOfCores {
}