package com.raphael.fundamentals.infra;
import com.raphael.fundamentals.oo.Notificador;

public class ConsoleNotificador implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[CONSOLE-NOTIFY]: " + mensagem);
    }
}
