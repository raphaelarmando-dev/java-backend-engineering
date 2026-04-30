package com.raphael.fundamentals.oo;

import java.math.BigDecimal;

public abstract class Account {
    protected String number;
    protected BigDecimal balance;

    public Account(String number) {
        this.number = number;
        this.balance = BigDecimal.ZERO;
    }

    public abstract void applyMonthlyFee();

    public void deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }
}
