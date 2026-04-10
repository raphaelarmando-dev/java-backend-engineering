package com.raphael.fundamentals.oo;

public class Encapsulamento {
    private String nomeUsuario;
    private int nivelAcesso; // 1 a 5

    public Encapsulamento(String nomeUsuario, int nivelInicial) {
        this.nomeUsuario = nomeUsuario;
        setNivelAcesso(nivelInicial);
    }

    public void setNivelAcesso(int nivel) {
        if (nivel >= 1 && nivel <= 5) {
            this.nivelAcesso = nivel;
            System.out.println("Nível alterado para: " + nivel);
        } else {
            System.out.println("Acesso negado: Nível inválido.");
        }
    }

    public int getNivelAcesso() {
        return this.nivelAcesso;
    }
}
