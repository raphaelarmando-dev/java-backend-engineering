package com.raphael.fundamentals.oo;

class Computador {
    protected String processador = "Intel i7";

    public void iniciar() {
        System.out.println("Sistema operacional iniciando...");
    }
}

public class Heranca extends Computador {
    private int cargaBateria = 80;

    public void verificarStatus() {
        System.out.println("Processador: " + processador);
        System.out.println("Bateria: " + cargaBateria + "%");
    }
}
