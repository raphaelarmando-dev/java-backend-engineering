package com.raphael.fundamentals.oo;

public interface NotificationGateway {
    void sendAlert(String message);
}

class TelegramGateway implements NotificationGateway {
    @Override
    public void sendAlert(String message) {
        System.out.println("Enviando via API do Telegram: " + message);
    }
}