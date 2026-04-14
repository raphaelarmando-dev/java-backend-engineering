package com.raphael.fundamentals.oo;

public class GerenciadorAcesso {
    public static void main(String[] args) {
        // Injeção manual: o sistema de login usa o serviço de log
        Notificavel logger = new LogService();
        UsuarioAdmin admin = new UsuarioAdmin("Raphael_Manager");

        System.out.println("Bem-vindo ao " + ConfiguracaoSistema.NOME_SISTEMA);

        String senhaDigitada = "senha_errada";

        if (!admin.validarAcesso(senhaDigitada)) {
            logger.enviarAlerta("Tentativa de invasão detectada no usuário: " + admin.getNome());
        }
    }
}