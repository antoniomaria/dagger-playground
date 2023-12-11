package com.acme.dagger.app;

import javax.inject.Scope;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@Scope
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface AppScope {
}