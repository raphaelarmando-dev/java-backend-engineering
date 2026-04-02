package com.raphael.fundamentals.classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.99;
        p1.desconto = 0.15;

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;


        // Chamar Metodo
        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();

        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Media do carrinho = R$%.2f\n", mediaCarrinho);
    }
}