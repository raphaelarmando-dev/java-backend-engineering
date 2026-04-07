package com.raphael.fundamentals.arrays;

public class Matriz {
    public static void main(String[] args) {
        double[][] notasDaTurma = new double[3][3]; // 3 alunos, 3 notas cada
        notasDaTurma[0][0] = 9.9;
        System.out.println("Primeira nota da matriz: " + notasDaTurma[0][0]);
    }
}