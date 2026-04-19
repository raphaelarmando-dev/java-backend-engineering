package com.raphael.fundamentals;
import com.raphael.fundamentals.infra.*;
import com.raphael.fundamentals.oo.*;

public class MainListagem {
    public static void main(String[] args) {
        CrudRepository<UsuarioSistema> repo = new UsuarioRepository();

        repo.inserir(new UsuarioAdmin("Raphael_1"));
        repo.inserir(new UsuarioAdmin("Raphael_2"));

        System.out.println("Relatório de Usuários:");
        repo.listarTodos().forEach(u -> System.out.println("- " + u.getLogin()));
    }
}
