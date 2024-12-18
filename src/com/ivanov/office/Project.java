package com.ivanov.office;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;                   // Название проекта
    private String deadline;               // Дедлайн
    private String status;                 // Статус ("Active", "Completed")
    private List<Employee> assignedEmployees; // Назначенные сотрудники

    public Project(String name, String deadline) {
        this.name = name;
        this.deadline = deadline;
        this.status = "Active";
        this.assignedEmployees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getStatus() {
        return status;
    }

    public List<Employee> getAssignedEmployees() {
        return assignedEmployees;
    }

    public void completeProject() {
        this.status = "Completed";
        System.out.println("Project " + name + " is completed!");
    }

    public void assignEmployee(Employee employee) {
        assignedEmployees.add(employee);
        System.out.println(employee.getName() + " assigned to project " + name);
    }

    public void displayProjectInfo() {
        System.out.println("Project: " + name);
        System.out.println("Deadline: " + deadline);
        System.out.println("Status: " + status);
        System.out.println("Assigned Employees:");
        for (Employee employee : assignedEmployees) {
            System.out.println("- " + employee.getName() + " (" + employee.getPosition() + ")");
        }
    }
}
