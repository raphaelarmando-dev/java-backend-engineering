package com.raphael.fundamentals;
import com.raphael.fundamentals.infra.*;
import com.raphael.fundamentals.oo.*;

public class MainCompleto {
    public static void main(String[] args) {
        BancoDados.getInstancia().conectar();

        UsuarioRepository repo = new UsuarioRepository();
        AuthService auth = new AuthService();

        UsuarioAdmin admin = new UsuarioAdmin("Raphael_Final_Boss");

        try {
            auth.autenticar(admin, "admin123");
            if (admin.isValido()) {
                repo.inserir(admin);
                System.out.println("Processo finalizado para ID: " + admin.getId());
            }
        } catch (AuthException e) {
            LoggerService.logInfo("BLOQUEIO: " + e.getMessage());
        }
    }
}
