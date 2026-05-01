package com.raphael.fundamentals.oo;

public interface Logger {
    void log(String message);
}

class ConsoleLogger implements Logger {
    @Override
    public void log(String message) { System.out.println("[LOG]: " + message); }
}
