package com.raphael.fundamentals;

import com.raphael.fundamentals.oo.*;
import com.raphael.fundamentals.infra.*;

public class MainPrincipal {
    public static void main(String[] args) {
        BancoDados.getInstancia().conectar();

        AuthService authService = new AuthService();
        UsuarioAdmin admin = new UsuarioAdmin("Raphael_Dev");
        UsuarioRepository repo = new UsuarioRepository();

        try {
            authService.autenticar(admin, "admin123");

            if (admin.isValido()) {
                repo.inserir(admin);
            }
        } catch (AuthException e) {
            LoggerService.logInfo("SEGURANÇA: " + e.getMessage());
        }
    }
}