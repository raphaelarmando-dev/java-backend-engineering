package com.raphael.fundamentals.infra;

public class ConfiguracaoSistemaInfra {
    private static ConfiguracaoSistemaInfra instancia;

    public final String VERSAO = "1.0.0-STABLE";
    private final String AMBIENTE = "DESENVOLVIMENTO";

    private ConfiguracaoSistemaInfra() {}

    public static ConfiguracaoSistemaInfra getInstancia() {
        if (instancia == null) instancia = new ConfiguracaoSistemaInfra();
        return instancia;
    }

    public String getAmbiente() {
        return AMBIENTE;
    }
}
