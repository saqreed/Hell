package com.ivanov.karate;

public class Karateka {
    private final String name;
    private final MoveStrategy strategy;

    public Karateka(String name) {
        this.name = name;
        this.strategy = new MoveStrategy();
    }

    public void addMove(Move move) {
        strategy.addMove(move);
    }

    public void removeMove(int index) {
        strategy.removeMove(index);
    }

    public void executeMoves() {
        strategy.executeMoves(name);
    }

    @Override
    public String toString() {
        return "Каратист: " + name;
    }
}
