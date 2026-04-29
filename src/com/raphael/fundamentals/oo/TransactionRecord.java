package com.raphael.fundamentals.oo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record TransactionRecord(String id, BigDecimal amount, LocalDateTime timestamp) {

    public TransactionRecord {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor da transação deve ser positivo!");
        }
    }
}
