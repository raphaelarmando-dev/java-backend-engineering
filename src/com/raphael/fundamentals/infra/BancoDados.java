package com.raphael.fundamentals.infra;

public class BancoDados {
    private static BancoDados instancia;

    private BancoDados() {
    }

    public static BancoDados getInstancia() {
        if (instancia == null) {
            instancia = new BancoDados();
        }
        return instancia;
    }

    public void conectar() {
        System.out.println("Conexão estabelecida com o banco de dados via Singleton.");
    }
}