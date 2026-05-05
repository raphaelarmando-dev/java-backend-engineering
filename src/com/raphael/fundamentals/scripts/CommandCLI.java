package com.raphael.fundamentals.scripts;

public class CommandCLI {
    public static void main(String[] args) {
        String command = "START";

        // Estrutura de Seleção: Escolha baseada em valor fixo
        switch (command) {
            case "START" -> System.out.println("Iniciando serviços...");
            case "STOP"  -> System.out.println("Parando sistemas...");
            case "RESTART" -> System.out.println("Reiniciando...");
            default      -> System.out.println("Comando inválido.");
        }
    }
}
