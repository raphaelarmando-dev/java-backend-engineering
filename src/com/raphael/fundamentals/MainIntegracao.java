package com.raphael.fundamentals;

import com.raphael.fundamentals.oo.UsuarioAdmin;
import com.raphael.fundamentals.infra.BancoDados;
import com.raphael.fundamentals.infra.UsuarioRepository;

public class MainIntegracao {
    public static void main(String[] args) {
        // Inicializa Infra
        BancoDados.getInstancia().conectar();
        UsuarioRepository repo = new UsuarioRepository();

        // Cria Negócio (OO)
        UsuarioAdmin admin = new UsuarioAdmin("Raphael_Dev");

        // Persiste
        repo.salvar(admin);
    }
}