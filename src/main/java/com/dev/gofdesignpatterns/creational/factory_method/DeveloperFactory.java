package com.dev.gofdesignpatterns.creational.factory_method;

public interface DeveloperFactory {

    String JAVA_SPECIALITY = "Java";
    String CPP_SPECIALITY = "C++";

    Developer createDeveloper();

}
