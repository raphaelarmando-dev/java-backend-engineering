package com.raphael.fundamentals.oo;

public class LogService implements Notificavel {
    @Override
    public void enviarLog(String mensagem) {
        System.out.println("[LOG DO SISTEMA] " + mensagem.toUpperCase());
    }
}