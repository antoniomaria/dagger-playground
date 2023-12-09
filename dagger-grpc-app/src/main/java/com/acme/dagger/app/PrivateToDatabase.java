package com.acme.dagger.app;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@Scope
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface PrivateToDatabase {
}