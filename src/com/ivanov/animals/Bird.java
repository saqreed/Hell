package com.ivanov.animals;

public class Bird implements Animal {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        makeSound(1); // По умолчанию один раз
    }

    @Override
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(name + " sings: Tweet-tweet!");
            SoundCounter.recordSound(name); // Записываем каждый звук
        }
    }

    @Override
    public void react(String action) {
        switch (action.toLowerCase()) {
            case "погладить":
                System.out.println(name + " счастливо чирикает.");
                break;
            case "покормить":
                System.out.println(name + " клюет зернышки с радостью.");
                break;
            case "испугать":
                System.out.println(name + " улетает в страхе.");
                break;
            default:
                System.out.println(name + " наклоняет голову, не понимая.");
        }
    }
}
