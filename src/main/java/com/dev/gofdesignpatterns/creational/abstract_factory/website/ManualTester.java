package com.dev.gofdesignpatterns.creational.abstract_factory.website;

import com.dev.gofdesignpatterns.creational.abstract_factory.Tester;

public class ManualTester implements Tester {

    @Override
    public void testCode() {
        System.out.println("Manual Tester test website...");
    }

}
