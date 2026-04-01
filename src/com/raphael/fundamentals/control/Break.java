package com.raphael.fundamentals.control;

@SuppressWarnings("all")
public class Break {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if(i == 5) {
                break;
            }
            System.out.println(i);

        }

        System.out.println("Fim!");

        // Break Rotulado

        externo: for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                if(i == 1) {
                    break externo;
                }

                System.out.printf(" [%d %d] ", i, j);
            }
            System.out.println();
        }
        System.out.println("Fim!");
    }
}
