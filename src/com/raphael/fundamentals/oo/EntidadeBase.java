package com.raphael.fundamentals.oo;
import java.time.LocalDateTime;
import java.util.UUID;

public abstract class EntidadeBase {
    protected String id = UUID.randomUUID().toString();
    protected LocalDateTime dataCriacao = LocalDateTime.now();

    public String getId() { return id; }
    public LocalDateTime getDataCriacao() { return dataCriacao; }
}
