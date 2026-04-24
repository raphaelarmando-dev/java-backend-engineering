package com.raphael.fundamentals.infra;
import java.util.List;

public interface IRepository<T> {
    void salvamento(T entidade) throws Exception;
    List<T> buscarTodos();
}
