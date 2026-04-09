package com.raphael.fundamentals.arrays;

import java.util.ArrayList;
import java.util.Comparator;

public class OrdenacaoTeste {
    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<>();
        lista.add(new Produto("Cadeira Gamer", 1500.0));
        lista.add(new Produto("Mesa", 800.0));
        lista.sort(Comparator.comparingDouble(p -> Double.parseDouble
                (p.getDetails().split("R\\$ ")[1])));
        lista.forEach(p -> System.out.println(p.getDetails()));
    }
}
