package com.ivanov.storage;

public class StorageProcessor {
    public static void processIntegerStorage(Storage<Integer> storage, int alternative) {
        System.out.println("Значение: " + storage.getOrElse(alternative));
    }

    public static void processStringStorage(Storage<String> storage, String alternative) {
        System.out.println("Значение: " + storage.getOrElse(alternative));
    }
}
