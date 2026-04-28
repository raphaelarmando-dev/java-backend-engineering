package com.raphael.fundamentals.oo;

import java.math.BigDecimal;

public class CreditCard {
    private String holder;
    private BigDecimal limit;
    private BigDecimal balance;

    public CreditCard(String holder, BigDecimal limit) {
        this.holder = holder;
        this.limit = limit;
        this.balance = BigDecimal.ZERO;
    }

    public void processPurchase(BigDecimal amount) {
        if (amount.add(balance).compareTo(limit) > 0) {
            throw new RuntimeException("Limite insuficiente!");
        }
        this.balance = this.balance.add(amount);
    }

    public BigDecimal getAvailableLimit() {
        return limit.subtract(balance);
    }
}
