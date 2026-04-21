package com.raphael.fundamentals.infra;
import com.raphael.fundamentals.oo.Notificador;

public class EmailNotificador implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[EMAIL-SERVICE]: " + mensagem);
    }
}
