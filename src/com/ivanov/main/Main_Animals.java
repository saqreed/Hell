package com.ivanov.main;

import com.ivanov.animals.*;

public class Main_Animals {
    public static void main(String[] args) {
        Animal cat = new Cat("Mittens");
        Animal dog = new Dog("Rex");
        Animal bird = new Bird("Chirpy");

        cat.makeSound(3); // Мяукает три раза
        dog.makeSound(2); // Лает два раза
        bird.makeSound(5); // Чирикает пять раз

        System.out.println("\n--- Реакции на действия ---");
        cat.react("погладить");
        dog.react("испугать");
        bird.react("покормить");

        System.out.println("\n--- Подсчет звуков ---");
        SoundCounter.printAllCounts(); // Печатает количество звуков каждого животного
    }
}
