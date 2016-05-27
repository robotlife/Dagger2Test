package com.test;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class SchoolModule {
    public SchoolModule() {

    }

    @Provides
    public School provideSchool() {
        return new School();
    }

}
