package com.dev.gofdesignpatterns.creational.factory_method;

public class Program {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactory("java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    public static DeveloperFactory createDeveloperFactory(String speciality) {
        if (DeveloperFactory.JAVA_SPECIALITY.equalsIgnoreCase(speciality)) {
            return new JavaDeveloperFactory();
        } else if (DeveloperFactory.CPP_SPECIALITY.equalsIgnoreCase(speciality)) {
            return new CppDeveloperFactory();
        } else {
            throw new IllegalArgumentException("Invalid speciality: " + speciality);
        }
    }

}
