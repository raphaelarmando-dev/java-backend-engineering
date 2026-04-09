package com.raphael.fundamentals.arrays;

public class EstoqueDinamico {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[2];
        produtos[0] = new Produto("Monitor", 1200.0);
        produtos[1] = new Produto("Teclado", 350.0);


        if (produtos.length == 2) {
            Produto[] novoArray = new Produto[produtos.length * 2];
            System.arraycopy(produtos, 0, novoArray, 0, produtos.length);
            produtos = novoArray;
        }

        produtos[2] = new Produto("Mouse", 150.0);
        System.out.println("Novo tamanho do array na Heap: " + produtos.length);
    }
}
