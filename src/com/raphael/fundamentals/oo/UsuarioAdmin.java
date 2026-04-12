package com.raphael.fundamentals.oo;

public class UsuarioAdmin extends UsuarioSistema {

    public UsuarioAdmin(String login) {
        super(login);
    }

    @Override
    public void acessar() {
        System.out.println("ACESSO ADMINISTRATIVO: Monitorando logs do sistema...");
        super.acessar();
    }
}