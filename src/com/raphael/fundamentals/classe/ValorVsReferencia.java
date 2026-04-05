package com.raphael.fundamentals.classe;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // Cópia do valor
        a++;
        b--;
        System.out.println(a + " " + b); // Saída: 3.0 1.0

        Data d1 = new Data(1, 1, 2026);
        Data d2 = d1; // Apontam para o mesmo lugar
        d2.dia = 31;
        System.out.println(d1.obterDataFormatada());
    }
}