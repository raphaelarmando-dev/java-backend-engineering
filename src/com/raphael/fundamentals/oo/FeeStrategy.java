package com.raphael.fundamentals.oo;

public abstract class FeeStrategy {
    public abstract double calculate(double amount);
}

class StandardFee extends FeeStrategy {
    @Override
    public double calculate(double amount) { return amount * 0.02; }
}

class WhaleFee extends FeeStrategy {
    @Override
    public double calculate(double amount) { return amount * 0.01; }
}
