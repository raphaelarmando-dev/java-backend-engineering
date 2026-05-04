package com.raphael.fundamentals.oo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionProcessor {
    public TransactionEvent process(Transactable origin, BigDecimal amount) {
        origin.processPurchase(amount);
        return new TransactionEvent("ID-123", amount, LocalDateTime.now());
    }
}
