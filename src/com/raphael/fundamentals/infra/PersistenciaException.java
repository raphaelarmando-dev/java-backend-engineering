package com.raphael.fundamentals.infra;

public class PersistenciaException extends Exception {
    public PersistenciaException(String mensagem) {
        super("ERRO NA CAMADA DE INFRA: " + mensagem);
    }
}