package com.raphael.fundamentals.classe;
@SuppressWarnings("all")
public class Produto {

    // Atributos
    String nome;
    double preco;
    double desconto;
    // Metodo
    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    Produto(){}

    // This
    Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }
}