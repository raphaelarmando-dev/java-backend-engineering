package com.raphael.fundamentals.oo;

import java.util.*;

interface Observer { void update(double amount); }

class TelegramBot implements Observer {
    public void update(double amount) { System.out.println("Bot Telegram: Baleia detectada! R$ " + amount); }
}

class WhaleMonitor {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) { observers.add(observer); }

    public void notifyBaleia(double amount) {
        observers.forEach(obs -> obs.update(amount));
    }
}
