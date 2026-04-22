package com.raphael.fundamentals;
import com.raphael.fundamentals.infra.*;
import com.raphael.fundamentals.oo.*;

public class MainIntegrationTest {
    public static void main(String[] args) {
        UsuarioRepository repo = new UsuarioRepository();

        UsuarioAdmin bugado = new UsuarioAdmin("U");

        try {
            System.out.println("Tentando persistir usuário inválido...");
            repo.persistir(bugado);
        } catch (PersistenciaException e) {
            LoggerService.logInfo("SISTEMA PROTEGIDO: " + e.getMessage());
        }

        System.out.println("Status final: Sistema operacional e íntegro.");
    }
}
