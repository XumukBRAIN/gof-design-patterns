package com.dev.gofdesignpatterns.creational.singleton;

public class ProgramRunner {

    public static void main(String[] args) {
        ProgramLogger logger = ProgramLogger.getInstance();
        logger.addLog("First log");
        logger.addLog("Second log");
        logger.addLog("Third log");

        System.out.println(logger.getAllLogs());
    }

}
