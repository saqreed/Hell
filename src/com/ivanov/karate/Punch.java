package com.ivanov.karate;

public class Punch implements Move {
    @Override
    public void execute(String name) {
        System.out.println(name + ": кия!");
    }
}
