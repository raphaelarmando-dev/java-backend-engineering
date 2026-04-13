package com.raphael.fundamentals.oo;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Notificavel logger = new LogService();

        UsuarioSistema user = new UsuarioAdmin("Raphael_Admin");

        if (user.validarAcesso("admin123")) {
            user.acessar();
            logger.enviarLog("Usuário " + user.getLogin() + " entrou no sistema.");
        } else {
            logger.enviarLog("Tentativa de login falhou!");
        }
    }
}
