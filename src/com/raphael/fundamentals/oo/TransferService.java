package com.raphael.fundamentals.oo;

import java.math.BigDecimal;

public class TransferService {
    public void execute(CreditCard origin, CreditCard destination, BigDecimal amount) {
        if (origin.getAvailableLimit().compareTo(amount) < 0) {
            throw new RuntimeException("Limite insuficiente para transferência");
        }
        origin.processPurchase(amount);
        destination.deposit(amount);
    }
}
