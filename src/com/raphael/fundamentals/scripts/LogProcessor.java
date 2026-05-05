package com.raphael.fundamentals.scripts;

public class LogProcessor {
    public static void main(String[] args) {
        String[] logs = {"ERROR_404", "INFO_200", "ERROR_500"};

        // Estrutura de Repetição Avançada: Percorre cada elemento do array
        for (String log : logs) {
            if (log.startsWith("ERROR")) {
                System.out.println("Crítico detectado: " + log);
            }
        }
    }
}
