package com.raphael.fundamentals.oo;

import java.math.BigDecimal;


public interface Transactable {
    void processPurchase(BigDecimal amount);
    void deposit(BigDecimal amount);
}