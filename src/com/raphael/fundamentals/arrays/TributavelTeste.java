package com.raphael.fundamentals.arrays;

import java.util.ArrayList;

public class TributavelTeste {
    public static void main(String[] args) {
        ArrayList<Tributavel> listaTributavel = new ArrayList<>();

        listaTributavel.add(new Produto("Laptop", 4000.0));
        listaTributavel.add(new Produto("Monitor", 1200.0));

        for (Tributavel t : listaTributavel) {
            System.out.println("Imposto devido: R$ " + t.getValorImposto());
        }
    }
}
