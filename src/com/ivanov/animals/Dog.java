package com.ivanov.animals;

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        makeSound(1); // По умолчанию один раз
    }

    @Override
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(name + " says: Woof!");
            SoundCounter.recordSound(name); // Записываем каждый звук
        }
    }

    @Override
    public void react(String action) {
        switch (action.toLowerCase()) {
            case "погладить":
                System.out.println(name + " радостно виляет хвостом.");
                break;
            case "покормить":
                System.out.println(name + " лает от радости и ест.");
                break;
            case "испугать":
                System.out.println(name + " громко лает, защищаясь.");
                break;
            default:
                System.out.println(name + " смотрит на вас, не понимая.");
        }
    }
}
