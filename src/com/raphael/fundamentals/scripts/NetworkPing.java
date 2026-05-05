package com.raphael.fundamentals.scripts;

public class NetworkPing {
    public static void main(String[] args) {
        // Estrutura de Repetição: Executa exatamente 4 vezes
        for (int i = 1; i <= 4; i++) {
            System.out.println("Enviando pacote " + i + " para 127.0.0.1..."); // Lógica de delay simulada
        }
        System.out.println("Varredura concluída.");
    }
}
