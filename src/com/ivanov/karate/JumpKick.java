package com.ivanov.karate;

public class JumpKick implements Move {
    @Override
    public void execute(String name) {
        System.out.println(name + ": вжух!");
    }
}
