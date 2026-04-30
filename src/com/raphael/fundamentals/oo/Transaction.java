package com.raphael.fundamentals.oo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private final String id;
    private final BigDecimal value;
    private final LocalDateTime timestamp;

    public Transaction(String id, BigDecimal value) {
        // Validação no construtor: O objeto nasce "certo"
        if (value.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor deve ser positivo");
        }
        this.id = id;
        this.value = value;
        this.timestamp = LocalDateTime.now();
    }

    // Sem Setters! Isso garante que a transação não seja alterada após criada.
    public String getId() { return id; }
    public BigDecimal getValue() { return value; }
}
