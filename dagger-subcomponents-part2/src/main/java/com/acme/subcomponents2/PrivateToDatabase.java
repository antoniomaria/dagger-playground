package com.acme.subcomponents2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Qualifier;

//@Scope
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface PrivateToDatabase {
}