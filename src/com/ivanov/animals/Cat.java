package com.ivanov.animals;

public class Cat implements Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        makeSound(1); // По умолчанию один раз
    }

    @Override
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(name + " says: Meow!");
            SoundCounter.recordSound(name); // Записываем каждый звук
        }
    }

    @Override
    public void react(String action) {
        switch (action.toLowerCase()) {
            case "погладить":
                System.out.println(name + " мурлыкает от удовольствия.");
                break;
            case "покормить":
                System.out.println(name + " счастливо ест корм.");
                break;
            case "испугать":
                System.out.println(name + " убегает и прячется под диван.");
                break;
            default:
                System.out.println(name + " не понимает, что вы делаете.");
        }
    }
}
