package com.raphael.fundamentals;

import com.raphael.fundamentals.infra.UsuarioRepository;
import com.raphael.fundamentals.oo.AuthService;
import com.raphael.fundamentals.oo.UsuarioAdmin;

public class SistemaWorkflow {
    public static void main(String[] args) {
        AuthService auth = new AuthService();
        UsuarioRepository repo = new UsuarioRepository();
        UsuarioAdmin admin = new UsuarioAdmin("Raphael_Security");

        auth.realizarLogin(admin, "admin123");
        repo.inserir(admin);

        System.out.println("Workflow de segurança finalizado com sucesso.");
    }
}