package com.raphael.fundamentals.arrays;

public class Produto implements Tributavel {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getValorImposto() {
        return this.preco * 0.1;
    }

    public String getDetails() {
        return nome + " - R$ " + preco;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
}
