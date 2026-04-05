package com.raphael.fundamentals.classe;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a;
        a++;
        b--;
        System.out.println(a + " " + b);

        Data d1 = new Data(1, 1, 2026);
        Data d2 = d1;
        d2.dia = 31;
        System.out.println(d1.obterDataFormatada());
        Data d3 = new Data();
        System.out.println(d3.obterDataFormatada());
    }
}