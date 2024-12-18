package com.ivanov.stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
    private final ArrayList<T> elements;

    public Stack() {
        elements = new ArrayList<>();
    }

    public void push(T element) {
        elements.add(element);
    }

    public T pop() {
        if (elements.isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.remove(elements.size() - 1);
    }

    public T peek() {
        if (elements.isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.get(elements.size() - 1);
    }

    // Проверить, пустой ли стек
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    // Получить размер стека
    public int size() {
        return elements.size();
    }
}
