package com.raphael.fundamentals.arrays;

import java.util.ArrayList;

public class ListaProdutos {
    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Webcam", 400.0));
        lista.add(new Produto("Microfone", 600.0));

        System.out.println("Total de elementos: " + lista.size());

        lista.remove(0);

        lista.removeIf(p -> p.getDetails().contains("Microfone"));

        if (lista.isEmpty()) {
            System.out.println("Lista limpa via predicados lambda.");
        }
    }
}
