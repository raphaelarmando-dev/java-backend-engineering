package com.raphael.fundamentals.infra;

public class BancoDados {
    private static BancoDados instancia;
    private boolean conectado = false;

    private BancoDados() {}

    public static BancoDados getInstancia() {
        if (instancia == null) instancia = new BancoDados();
        return instancia;
    }

    public void conectar() {
        if (conectado) {
            LoggerService.logInfo("Conexão já existente. Ignorando tentativa.");
            return;
        }
        System.out.println("Infra: Abrindo nova conexão...");
        this.conectado = true;
    }
}