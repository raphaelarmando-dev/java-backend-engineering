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

    Produto(String nomeInicial, double precoInicial, double descontoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }
}