package com.raphael.fundamentals.oo;

import java.math.BigDecimal;

public class CheckingAccount extends Account {
    private BigDecimal overdraftLimit;

    public CheckingAccount(String number, BigDecimal overdraftLimit) {
        super(number); // Chama o construtor da classe pai (Account)
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void applyMonthlyFee() {
        this.balance = this.balance.subtract(new BigDecimal("20.00"));
    }
}
