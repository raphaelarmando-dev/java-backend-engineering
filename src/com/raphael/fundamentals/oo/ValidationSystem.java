package com.raphael.fundamentals.oo;

import java.util.function.Predicate;

public class ValidationSystem {

    public static void main(String[] args) {
        Predicate<Double> isWhale = amount -> amount > 1_000_000;
        Predicate<Double> isMicro = amount -> amount < 1.0;

        System.out.println("É baleia? " + isWhale.test(1500000.0));
        System.out.println("É micro? " + isMicro.test(0.5));
    }
}