package com.raphael.fundamentals.control;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        int contador = 0;

        while (contador <= 20) {
            System.out.printf("i = %d\n", contador);
            contador += 2;
        }

        // While indetermindado

        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while (!valor.equalsIgnoreCase("sair")) {
            System.out.println("Voce diz: ");
            valor = entrada.nextLine();
        }

        entrada.close();
    }
}
