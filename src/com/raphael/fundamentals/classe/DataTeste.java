package com.raphael.fundamentals.classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data(); // Usa o this(1, 1, 1970)
        Data d2 = new Data(31, 12, 2026);

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();
    }
}