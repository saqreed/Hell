package com.ivanov.box;

public class BoxProcessor {
    public static void processBox(Box<Integer> box) {
        Integer value = box.get();
        System.out.println("Извлеченное значение из коробки: " + value);
    }
}
