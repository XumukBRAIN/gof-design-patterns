package com.dev.gofdesignpatterns.creational.builder;

public class CreatePersonService {

    public static void main(String[] args) {
        System.out.println("Starting creating person process...");
        Person person = Person.getPersonBuilder()
                .setName("Ivan")
                .setAge(18)
                .setCountry("Russia")
                .setCity("Moscow")
                .build();
        System.out.println("Creation successfully: " + person);

        System.out.println("--------------------------------");

        System.out.println("Starting changing person process...");
        Person.PersonBuilder builder = person.toBuilder();
        builder.setAge(22);
        Person changedPerson = builder.build();
        System.out.println("Changing successfully: " + changedPerson);
    }

}
