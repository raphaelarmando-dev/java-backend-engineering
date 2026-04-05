package com.raphael.fundamentals.classe;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // Cópia do valor
        a++;
        b--;
        System.out.println(a + " " + b); // Saída: 3.0 1.0
    }
}