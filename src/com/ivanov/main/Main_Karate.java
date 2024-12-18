package com.ivanov.main;
import com.ivanov.karate.*;
public class Main_Karate {
    public static void main(String[] args) {

        Karateka daniel = new Karateka("Дэниэл");

        daniel.addMove(new Punch());
        daniel.addMove(new Kick());
        daniel.addMove(new Punch());
        daniel.addMove(new JumpKick());

        System.out.println("Комбинация ударов для " + daniel + ":");
        daniel.executeMoves();

        // Изменяем комбинацию
        System.out.println("\nИзменяем комбинацию:");
        daniel.removeMove(1);
        daniel.addMove(new Kick());
        daniel.executeMoves();
    }
}

