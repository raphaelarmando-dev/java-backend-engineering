package com.raphael.fundamentals.oo;

public class AuthService {
    public void autenticar(Autenticavel sujeito, String senha) throws AuthException {
        if (!sujeito.validarAcesso(senha)) {
            throw new AuthException("Login falhou");
        }
        System.out.println("AuthService: Credenciais validadas com sucesso.");
    }
}