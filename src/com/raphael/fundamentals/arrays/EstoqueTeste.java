package com.raphael.fundamentals.arrays;

public class EstoqueTeste {
    public static void main(String[] args) {
        Produto[] cabine = new Produto[3];

        cabine[0] = new Produto("Teclado MonsGeek", 450.0);
        cabine[1] = new Produto("Headset Havit", 200.0);

        for (int i = 0; i < cabine.length; i++) {
            // Isso evita o erro de página (NullPointerException)
            if (cabine[i] != null) {
                System.out.println("Posição " + i + ": " + cabine[i].getDetails());
            } else {
                System.out.println("Posição " + i + ": Vazia");
            }
        }
    }
}