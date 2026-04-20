package com.raphael.fundamentals.oo;

public class UsuarioSistema extends EntidadeBase implements Autenticavel, ValidadorDados {
    private String login;
    protected String senhaCadastrada = "admin123";

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

    @Override
    public boolean isValido() {
        return this.login != null && this.login.length() >= 3;
    }

    public void acessar() {
        System.out.println("Usuário " + login + " logado no sistema.");
    }
}
