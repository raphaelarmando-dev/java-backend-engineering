package com.raphael.fundamentals;

import com.raphael.fundamentals.oo.UsuarioAdmin;
import com.raphael.fundamentals.infra.BancoDados;
import com.raphael.fundamentals.infra.UsuarioRepository;

public class MainIntegracao {
    public static void main(String[] args) {
        BancoDados.getInstancia().conectar();
        UsuarioRepository repo = new UsuarioRepository();

        UsuarioAdmin admin = new UsuarioAdmin("Raphael_Dev");


    }
}