package com.raphael.fundamentals.control;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a media: ");
        double media = entrada.nextDouble();

        if (media <= 10 && media >= 7.0) {
            System.out.println("Aprovado!");
            System.out.println("Parabens");
        }
        if (media < 7 && media >= 4.5)
            System.out.println("Recuperacao");

        boolean criterioReprovacaoAtingindo =
                media < 4.5 && media >= 0;

        if (criterioReprovacaoAtingindo) {
            System.out.println("Reprovado");
        }

        entrada.close();

        // Challange

        double nota = 1.3;
        // nao usar ; em estruturas de controle (tem excecao)
        if (nota >= 9.0) {
            System.out.println("Quadro de Honra!");
            System.out.println("Voce e fera!!!");
        }
    }
}
