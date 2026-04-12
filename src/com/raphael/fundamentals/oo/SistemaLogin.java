package com.raphael.fundamentals.oo;

import java.util.ArrayList;
import java.util.List;

public class SistemaLogin {
    public static void main(String[] args) {
        List<UsuarioSistema> usuarios = new ArrayList<>();
        usuarios.add(new UsuarioSistema("RaphaelDev"));
        usuarios.add(new UsuarioAdmin("RootAdmin"));

        String tentativaSenha = "123"; // Senha errada para testar

        for (UsuarioSistema u : usuarios) {
            try {
                if (!u.validarAcesso(tentativaSenha)) {
                    throw new AcessoNegadoException("Senha incorreta para: " + u.getClass().getSimpleName());
                }
                u.acessar();
            } catch (AcessoNegadoException e) {
                System.err.println("ALERTA DE SEGURANÇA: " + e.getMessage());
            }
        }
    }
}