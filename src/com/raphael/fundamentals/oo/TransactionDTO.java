package com.raphael.fundamentals.oo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record TransactionDTO(String id, BigDecimal value, LocalDateTime date) {
    public TransactionDTO {
        if (value.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor deve ser positivo");
        }
    }
}
