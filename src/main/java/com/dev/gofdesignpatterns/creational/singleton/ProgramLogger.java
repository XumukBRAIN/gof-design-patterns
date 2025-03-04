package com.dev.gofdesignpatterns.creational.singleton;

public class ProgramLogger {

    private final StringBuilder stringBuilder = new StringBuilder("This is log file:\n");

    public static ProgramLogger getInstance() {
        return ProgramLoggerHolder.INSTANCE;
    }

    public void addLog(String log) {
        stringBuilder.append(log).append("\n");
    }

    public String getAllLogs() {
        return stringBuilder.toString();
    }

    private static final class ProgramLoggerHolder {
        private static final ProgramLogger INSTANCE = new ProgramLogger();
    }

}
