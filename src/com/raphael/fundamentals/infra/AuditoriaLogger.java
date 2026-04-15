package com.raphael.fundamentals.infra;

import java.time.LocalDateTime;

public class AuditoriaLogger {
    public static void registrar(String acao) {
        System.out.println("[AUDIT - " + LocalDateTime.now() + "] " + acao);
    }
}
