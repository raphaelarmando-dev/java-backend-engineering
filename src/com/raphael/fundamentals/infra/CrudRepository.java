package com.raphael.fundamentals.infra;
import java.util.List;

public interface CrudRepository<T> {
    void inserir(T entidade);
    List<T> listarTodos();
}
