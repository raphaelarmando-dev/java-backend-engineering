package com.raphael.fundamentals;

import com.raphael.fundamentals.oo.UsuarioAdmin;
import com.raphael.fundamentals.infra.UsuarioRepository;
import com.raphael.fundamentals.infra.LoggerService;

public class Main {
    public static void main(String[] args) {
        UsuarioRepository repo = new UsuarioRepository();
        UsuarioAdmin admin = new UsuarioAdmin("Raphael");

        if (admin.isValido()) {
            repo.inserir(admin);
            LoggerService.logInfo("Usuário criado em: " + admin.getDataCriacao());
        } else {
            System.err.println("Erro: Usuário inválido para persistência.");
        }
    }
}
