package com.raphael.fundamentals.oo;

public class UsuarioSistema implements Autenticavel {
    private String login;
    private String senhaCadastrada = "admin123";

    public UsuarioSistema(String login) {
        this.login = login;
    }
    public String getLogin() {
        return this.login;
    }

    @Override
    public boolean validarAcesso(String senha) {
        return this.senhaCadastrada.equals(senha);
    }

    public void acessar() {
        System.out.println("Usuário " + login + " logado no sistema.");
    }


}
