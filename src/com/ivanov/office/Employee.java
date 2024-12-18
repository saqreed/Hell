package com.ivanov.office;

public class Employee {
    private String name;      // Имя сотрудника
    private String position;  // Должность
    private double salary;    // Зарплата
    private boolean isActive; // Работает или уволен

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
        this.salary = 0;
        this.isActive = true;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void fire() {
        isActive = false;
        System.out.println(name + " has been fired.");
    }

    public void performTask(String task) {
        if (isActive) {
            System.out.println("Employee " + name + " is performing task: " + task);
        } else {
            System.out.println("Employee " + name + " is not working (fired).");
        }
    }
}
