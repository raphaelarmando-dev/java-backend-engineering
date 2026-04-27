package com.raphael.fundamentals.oo;

import java.util.*;
import java.util.stream.Collectors;

public class DataProcessing {
    public static void main(String[] args) {
        List<Double> transactions = Arrays.asList(5000.0, 10.0, 15000.0, 45.0, 200.0);

        List<String> whaleAlerts = transactions.stream()
                .filter(t -> t > 1000)
                .map(t -> "ALERTA: Movimentação de R$ " + t)
                .collect(Collectors.toList());

        whaleAlerts.forEach(System.out::println);
    }
}
