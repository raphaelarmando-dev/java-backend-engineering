package com.raphael.fundamentals.oo;

public abstract class Notifica {
    protected String destination;

    public Notifica(String destination) {
        this.destination = destination;
    }

    public abstract void send(String message);
}

class PushNotification extends Notifica {
    public PushNotification(String token) { super(token); }

    @Override
    public void send(String message) {
        System.out.println("Enviando Push para o token " + destination + ": " + message);
    }
}
