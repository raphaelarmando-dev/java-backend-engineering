package com.raphael.fundamentals.scripts;

public class MemoryMonitor {
    public static void main(String[] args) {
        double memoryUsage = 50.0;

        // Repete enquanto a memória estiver abaixo do limite crítico
        while (memoryUsage < 90.0) {
            System.out.println("Status: Estável (" + memoryUsage + "%)");
            memoryUsage += 15.0; // Simulando aumento de carga
        }
        System.out.println("ALERTA: Memória Crítica!");
    }
}
