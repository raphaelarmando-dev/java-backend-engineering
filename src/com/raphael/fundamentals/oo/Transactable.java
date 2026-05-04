package com.raphael.fundamentals.oo;

import java.math.BigDecimal;


public sealed interface Transactable permits CreditCard {
    void processPurchase(BigDecimal amount);
    void deposit(BigDecimal amount);
}