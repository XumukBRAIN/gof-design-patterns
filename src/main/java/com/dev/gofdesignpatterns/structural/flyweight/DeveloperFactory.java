package com.dev.gofdesignpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {

    private final Map<String, Developer> devs = new HashMap<>();

    public Developer getDeveloper(String language) {
        Developer developer = devs.get(language);
        if (developer == null) {
            switch (language) {
                case "Java":
                    developer = new JavaDeveloper();
                    devs.put(language, developer);
                    break;
                case "Python":
                    developer = new PythonDeveloper();
                    devs.put(language, developer);
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported language: " + language);
            }
        }

        return developer;
    }

}
