package com.ivanov.office;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;                   // Название отдела
    private Boss boss;                     // Босс отдела
    private List<Employee> employees;      // Список сотрудников
    private double budget;                 // Бюджет отдела
    private List<Project> projects;        // Список проектов

    public Department(String name, Boss boss, double budget) {
        this.name = name;
        this.boss = boss;
        this.budget = budget;
        this.employees = new ArrayList<>();
        this.projects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Boss getBoss() {
        return boss;
    }

    public double getBudget() {
        return budget;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(String name) {
        employees.removeIf(employee -> employee.getName().equals(name));
    }

    public void allocateBudget() {
        if (employees.isEmpty()) {
            System.out.println("No employees to allocate the budget.");
            return;
        }
        double salaryPerEmployee = budget / employees.size();
        for (Employee employee : employees) {
            employee.setSalary(salaryPerEmployee);
        }
    }

    public void giveBonus(String employeeName, double bonusAmount) {
        for (Employee employee : employees) {
            if (employee.getName().equals(employeeName)) {
                employee.setSalary(employee.getSalary() + bonusAmount);
                System.out.println(employeeName + " received a bonus of " + bonusAmount);
                return;
            }
        }
        System.out.println("Employee " + employeeName + " not found.");
    }

    public void addProject(Project project) {
        projects.add(project);
        System.out.println("Project " + project.getName() + " added to " + name);
    }

    public void displayInfo() {
        System.out.println("Department: " + name);
        System.out.println("Boss: " + boss.getName());
        System.out.println("Budget: " + budget);
        System.out.println("Employees:");
        for (Employee employee : employees) {
            System.out.println("- " + employee.getName() + " (" + employee.getPosition() + "), Salary: " + employee.getSalary());
        }
        System.out.println("Projects:");
        for (Project project : projects) {
            System.out.println("- " + project.getName() + " (Deadline: " + project.getDeadline() + ", Status: " + project.getStatus() + ")");
        }
    }
}
