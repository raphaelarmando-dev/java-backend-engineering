package com.raphael.fundamentals.infra;

public class PerformanceMonitor {
    public static void monitor(Runnable acao) {
        long inicio = System.currentTimeMillis();
        acao.run();
        long fim = System.currentTimeMillis();
        LoggerService.logInfo("Tempo de execução: " + (fim - inicio) + "ms");
    }
}
