package com.raphael.fundamentals.control;

@SuppressWarnings("all")
public class For {
    public static void main(String[] args) {
        for(int contador = 1; contador <= 10; contador++) {
            System.out.printf("i = %d\n", contador);
        }
        // Laco infinito!!!
//      for(;;) {
//            System.out.println("Fim!");
//        }

        for(int contador = 10; contador >= 0; contador -= 2) {
            System.out.printf("Contador = %d\n", contador);
        }

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.printf("[%d %d]", i, j);
            }
            System.out.println();
        }
    }
}

