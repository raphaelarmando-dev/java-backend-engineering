package com.raphael.fundamentals.classe;

public class Data {
    int dia;
    int mes;
    int ano;

    Data() {
        this(1, 1, 1970); // Chama o outro construtor usando 'this()'
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }
}