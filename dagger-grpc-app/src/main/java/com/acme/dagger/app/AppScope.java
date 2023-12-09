package com.acme.dagger.app;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
//import javax.inject.Qualifier;
import javax.inject.Scope;

//@Scope
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface AppScope {
}