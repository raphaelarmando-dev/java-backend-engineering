package com.raphael.fundamentals.oo;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDispositivos {
    public static void main(String[] args) {
        // Polimorfismo com Collections
        List<DispositivoSom> lista = new ArrayList<>();

        lista.add(new Radio());
        lista.add(new Alarme());
        lista.add(new Radio());

        System.out.println("--- Iniciando Teste de Dispositivos ---");

        // Loop polimórfico
        for (DispositivoSom d : lista) {
            d.tocar();
        }
    }
}