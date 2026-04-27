package com.raphael.fundamentals.oo;

interface MatchmakingStrategy {
    void findMatch(String playerId);
}

class CasualMatchmaking implements MatchmakingStrategy {
    public void findMatch(String playerId) {
        System.out.println("Buscando partida rápida para: " + playerId);
    }
}

class RankedMatchmaking implements MatchmakingStrategy {
    public void findMatch(String playerId) {
        System.out.println("Calculando MMR e buscando oponentes para: " + playerId);
    }
}

class MatchmakingService {
    private final MatchmakingStrategy strategy;

    public MatchmakingService(MatchmakingStrategy strategy) {
        this.strategy = strategy;
    }

    public void start(String player) { strategy.findMatch(player); }
}
