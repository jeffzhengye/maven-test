package com.aaa.mtest;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

public class NameinInject {
    @Inject
    @Named("red")
    private String service;

    public static void main(String[] args) {
        NameinInject fizzFuzz = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                bindConstant().annotatedWith(Names.named("red")).to("red-service");
            }    
        }).getInstance(NameinInject.class);

        System.out.println(fizzFuzz.service);
    }
}