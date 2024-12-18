package com.ivanov.office;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private List<Employee> team; // Список сотрудников под управлением

    public Manager(String name, String position) {
        super(name, position);
        this.team = new ArrayList<>();
    }

    public void addToTeam(Employee employee) {
        team.add(employee);
        System.out.println(employee.getName() + " added to manager " + getName() + "'s team.");
    }

    public void removeFromTeam(String name) {
        team.removeIf(employee -> employee.getName().equals(name));
        System.out.println(name + " removed from manager " + getName() + "'s team.");
    }

    public void displayTeam() {
        System.out.println("Manager " + getName() + "'s team:");
        for (Employee employee : team) {
            System.out.println("- " + employee.getName() + " (" + employee.getPosition() + ")");
        }
    }
}
