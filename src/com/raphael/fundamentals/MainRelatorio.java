package com.raphael.fundamentals;
import com.raphael.fundamentals.infra.*;
import com.raphael.fundamentals.oo.*;

public class MainRelatorio {
    public static void main(String[] args) {
        BancoDados.getInstancia().conectar();
        UsuarioRepository repo = new UsuarioRepository();

        UsuarioAdmin admin = new UsuarioAdmin("Raphael_Auditor");
        repo.inserir(admin);

        System.out.println("--- RELATÓRIO DE SISTEMA ---");
        repo.listarTodos().forEach(u -> {
            System.out.println("ID: " + u.getId() + " | Login: " + u.getLogin());
        });
    }
}
