package com.raphael.fundamentals.control;

public class Continue {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            if(i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }
        for (int i = 1; i <= 10; i++) {
            if (i == 5) continue;
            System.out.println(i);
        }

        // Continue Rotulado

        externo:
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                if (i == 1) {
                    continue externo;
                }

                System.out.printf("[%d %d] ", i, j);
            }
            System.out.println();
        }
        System.out.println("Fim!");
    }
}
