package com.raphael.fundamentals.infra;

public class BancoDados {
    private static BancoDados instancia;
    private BancoDados() {}

    public static BancoDados getInstancia() {
        if (instancia == null) { instancia = new BancoDados(); }
        return instancia;
    }

    public void conectar() {
        try {
            System.out.println("Infra: Estabelecendo conexão...");
            Thread.sleep(1000); // Simula 1 segundo de latência de rede
            System.out.println("Infra: Banco conectado com sucesso.");
        } catch (InterruptedException e) {
            System.err.println("Erro ao conectar no banco.");
        }
    }
}