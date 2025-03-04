package com.dev.gofdesignpatterns.creational.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {

    private String name;
    private int age;
    private String country;
    private String city;

    public static PersonBuilder getPersonBuilder() {
        return new PersonBuilder();
    }

    public PersonBuilder toBuilder() {
        return (new PersonBuilder()).setName(this.name).setAge(this.age).setCountry(this.country).setCity(this.city);
    }


    private Person(PersonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.country = builder.country;
        this.city = builder.city;
    }

    public static class PersonBuilder {
        private String name;
        private int age;
        private String country;
        private String city;

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public PersonBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
