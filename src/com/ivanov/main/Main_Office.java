package com.ivanov.main;

import com.ivanov.office.*;

public class Main_Office {
    public static void main(String[] args) {
        Boss boss = new Boss("Ivan Ivanov", 15); // Создаем босса
        Department department = new Department("IT Department", boss, 100000); // Отдел с бюджетом

        Employee emp1 = new Employee("Alex Smirnov", "Developer");
        Employee emp2 = new Employee("Maria Petrova", "Designer");
        Manager manager = new Manager("Olga Kuznetsova", "Team Lead");

        // Добавляем сотрудников
        department.addEmployee(emp1);
        department.addEmployee(emp2);
        department.addEmployee(manager);

        // Добавляем проект
        Project project1 = new Project("Website Redesign", "2024-12-01");
        department.addProject(project1);

        // Назначаем сотрудников на проект
        project1.assignEmployee(emp1);
        project1.assignEmployee(emp2);

        // Распределяем бюджет и показываем отдел
        department.allocateBudget();
        department.displayInfo();

        // Босс выделяет премию
        department.giveBonus("Alex Smirnov", 5000);

        // Завершаем проект
        project1.completeProject();
        project1.displayProjectInfo();

        // Увольняем сотрудника
        emp2.fire();
        department.displayInfo();
    }
}
