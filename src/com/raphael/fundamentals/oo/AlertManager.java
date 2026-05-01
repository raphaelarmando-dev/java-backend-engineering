package com.raphael.fundamentals.oo;

import java.util.List;

public class AlertManager {
    private final List<Logger> loggers;

    public AlertManager(List<Logger> loggers) {
        this.loggers = loggers;
    }

    public void broadcast(String alert) {
        loggers.forEach(l -> l.log(alert));
    }
}
