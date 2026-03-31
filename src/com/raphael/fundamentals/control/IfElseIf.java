package com.raphael.fundamentals.control;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        System.out.println("Digite a nota: ");

        Scanner entrada = new Scanner(System.in);

        double nota = entrada.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota Invalida!");
        } else if (nota >= 8.1) {
            System.out.println("A");
        } else if (nota >= 6.1) {
            System.out.println("B");
        } else if (nota >= 4.1) {
            System.out.println("C");
        } else if (nota >= 2.1) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }

        System.out.println("Fim!");

        entrada.close();
    }
}
