package com.raphael.fundamentals.classe;

public class Produto {

    // Atributos
    String nome;
    double preco;
    double desconto;
    // Metodo
    double precoComDesconto() {
        return preco * (1 - desconto);
    }
}