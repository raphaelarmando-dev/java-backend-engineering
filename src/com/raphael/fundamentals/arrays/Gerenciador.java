package com.raphael.fundamentals.arrays;

public class Gerenciador {
    public static void main(String[] args) {
        Produto[] lista = {
                new Produto("Mouse", 150.0),
                new Produto("Monitor", 1200.0),
                new Produto("Mousepad", 80.0)
        };

        String busca = "Monitor";
        boolean encontrado = false;

        for (Produto p : lista) {
            if (p.getDetails().contains(busca)) {
                System.out.println("Item encontrado: " + p.getDetails());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) System.out.println("Produto não localizado.");
    }
}

