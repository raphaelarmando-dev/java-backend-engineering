package com.raphael.fundamentals.infra;
import com.raphael.fundamentals.oo.Notificador;

public class NotificadorFactory {
    public static Notificador criar() {
        return new ConsoleNotificador();
    }
}
