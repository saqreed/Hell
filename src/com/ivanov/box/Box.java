package com.ivanov.box;

public class Box<T> {
    private T item;

    public void put(T item) {
        if (this.item != null) {
            throw new IllegalStateException("Коробка уже заполнена");
        }
        this.item = item;
    }

    public T get() {
        T value = this.item;
        this.item = null;
        return value;
    }

    public boolean isEmpty() {
        return this.item == null;
    }
}
