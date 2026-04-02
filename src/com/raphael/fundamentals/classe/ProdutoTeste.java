package com.raphael.fundamentals.classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4356.99, 0.15);

        // Construtor
        var p2 = new Produto("Caneta Preta", 12.56, 0.29);

        // Metodo
        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();

        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.println(p1.nome);
        System.out.println(p2.nome);
        System.out.printf("Media do carrinho = R$%.2f\n", mediaCarrinho);
    }
}