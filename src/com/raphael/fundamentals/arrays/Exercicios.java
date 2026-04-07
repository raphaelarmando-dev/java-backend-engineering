package com.raphael.fundamentals.arrays;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 8.5;
        notasAlunoA[1] = 7.0;
        notasAlunoA[2] = 9.2;

        System.out.println(notasAlunoA[0]);

        double totalAlunoA = 0;
        for(double nota: notasAlunoA) {
            totalAlunoA += nota;
        }
        System.out.println("Média: " + totalAlunoA / notasAlunoA.length);

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas notas? ");
        int qtdeNotas = entrada.nextInt();

        double[] notas = new double[qtdeNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }


        double total = 0;
        for (double nota : notas) {
            total += nota;
        }
        System.out.println("A média das notas é: " + (total / notas.length));

        entrada.close();
    }
}