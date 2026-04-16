package com.raphael.fundamentals;

import com.raphael.fundamentals.infra.UsuarioRepository;
import com.raphael.fundamentals.oo.UsuarioAdmin;
import com.raphael.fundamentals.oo.UsuarioDataHandler;

public class MainFinal {
    public static void main(String[] args) {
        UsuarioDataHandler handler = new UsuarioRepository();
        UsuarioAdmin admin = new UsuarioAdmin("Raphael_FullStack");

        try {
            handler.persistir(admin);
            System.out.println("Fluxo finalizado com sucesso!");
        } catch (Exception e) {
            System.err.println("Falha crítica no sistema: " + e.getMessage());
        }
    }
}