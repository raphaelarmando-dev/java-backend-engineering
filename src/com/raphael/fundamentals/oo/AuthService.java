package com.raphael.fundamentals.oo;

public class AuthService {
    public void realizarLogin(Autenticavel sujeito, String senha) {
        if (sujeito.validarAcesso(senha)) {
            System.out.println("AuthService: Acesso autorizado.");
        } else {
            System.out.println("AuthService: Acesso negado!");
        }
    }
}