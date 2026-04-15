package com.raphael.fundamentals.infra;
import java.util.ArrayList;
import java.util.List;

public class RepositorioBase<T> {
    protected List<T> dados = new ArrayList<>();

    public void inserir(T entidade) {
        dados.add(entidade);
        AuditoriaLogger.registrar("Inserção de " + entidade.getClass().getSimpleName());
    }
}