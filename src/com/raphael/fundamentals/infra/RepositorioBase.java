package com.raphael.fundamentals.infra;

import java.util.ArrayList;
import java.util.List;

public class RepositorioBase<T> {
    protected List<T> dados = new ArrayList<>();

    public void inserir(T entidade) {
        if (entidade != null) {
            dados.add(entidade);
            // AuditoriaLogger deve estar no mesmo pacote ou importado
            AuditoriaLogger.registrar("Objeto salvo: " + entidade.getClass().getSimpleName());
        }
    }
}