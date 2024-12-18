package com.ivanov.office;

public class Boss {
    private String name;      // Имя босса
    private int experience;   // Стаж работы босса

    // Конструктор для инициализации имени и стажа
    public Boss(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    // Геттеры для получения имени и стажа
    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    // Сеттеры для изменения имени и стажа
    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    // Метод для отдачи приказов
    public void giveOrder(String order) {
        System.out.println("Boss " + name + " gives the order: " + order);
    }
}
