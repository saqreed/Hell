package com.ivanov.main;

import com.ivanov.stack.Stack;

public class Main_Stack {
    public static void main(String[] args) {

        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);

        System.out.println("Верхний элемент: " + integerStack.peek()); // 30
        System.out.println("Извлеченный элемент: " + integerStack.pop()); // 30
        System.out.println("Новый верхний элемент: " + integerStack.peek()); // 20

        Stack<String> stringStack = new Stack<>();
        stringStack.push("Hello");
        stringStack.push("World");

        System.out.println("Верхний элемент: " + stringStack.peek()); // World
        System.out.println("Извлеченный элемент: " + stringStack.pop()); // World
        System.out.println("Новый верхний элемент: " + stringStack.peek()); // Hello
    }
}
