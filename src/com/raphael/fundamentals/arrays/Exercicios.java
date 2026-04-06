package com.raphael.fundamentals.arrays;

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
    }
}