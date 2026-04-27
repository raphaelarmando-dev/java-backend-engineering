package com.raphael.fundamentals.oo;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance = 100.0;

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InsufficientFundsException("Saldo insuficiente! Tentativa: " + amount);
        }
        balance -= amount;
    }
}
