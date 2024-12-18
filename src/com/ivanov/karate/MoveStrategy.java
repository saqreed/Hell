package com.ivanov.karate;

import java.util.ArrayList;
import java.util.List;

public class MoveStrategy {
    private final List<Move> moves;

    public MoveStrategy() {
        this.moves = new ArrayList<>();
    }

    public void addMove(Move move) {
        moves.add(move);
    }

    public void removeMove(int index) {
        if (index >= 0 && index < moves.size()) {
            moves.remove(index);
        } else {
            System.out.println("Некорректный индекс: " + index);
        }
    }

    public void setMove(int index, Move newMove) {
        if (index >= 0 && index < moves.size()) {
            moves.set(index, newMove);
        } else {
            System.out.println("Некорректный индекс: " + index);
        }
    }

    public void executeMoves(String name) {
        for (Move move : moves) {
            move.execute(name);
        }
    }
}
