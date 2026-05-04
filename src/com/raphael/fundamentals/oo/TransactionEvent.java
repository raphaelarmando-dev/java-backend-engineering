package com.raphael.fundamentals.oo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record TransactionEvent(String accountId, BigDecimal amount, LocalDateTime timestamp) {
    public TransactionEvent {
        if (timestamp == null) timestamp = LocalDateTime.now();
    }

}
