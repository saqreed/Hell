package com.ivanov.karate;

public class Kick implements Move {
    @Override
    public void execute(String name) {
        System.out.println(name + ": бац!");
    }
}
