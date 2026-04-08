package com.raphael.fundamentals.arrays;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getDetails() {
        return nome + " - R$ " + preco;
    }
}
