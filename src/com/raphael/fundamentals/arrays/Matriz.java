package com.raphael.fundamentals.arrays;

public class Matriz {
    public static void main(String[] args) {
        double[][] notasDaTurma = new double[3][3]; // 3 alunos, 3 notas cada
        notasDaTurma[0][0] = 9.9;
        System.out.println("Primeira nota da matriz: " + notasDaTurma[0][0]);
        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length; n++) {
                System.out.printf("Aluno %d, Nota %d: %.1f\n", a, n, notasDaTurma[a][n]);
            }
        }
    }
}