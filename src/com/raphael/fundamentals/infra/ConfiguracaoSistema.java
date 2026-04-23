package com.raphael.fundamentals.infra;

public class ConfiguracaoSistema {
    private static ConfiguracaoSistema instancia;
    public final String VERSAO = "1.0.0-STABLE";
    public final String AMBIENTE = "DESENVOLVIMENTO";

    private ConfiguracaoSistema() {}

    public static ConfiguracaoSistema getInstancia() {
        if (instancia == null) instancia = new ConfiguracaoSistema();
        return instancia;
    }
}
