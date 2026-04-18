package com.raphael.fundamentals.oo;

public class AuthException extends Exception {
    public AuthException(String login) {
        super("Falha crítica de autenticação para o usuário: " + login);
    }
}
