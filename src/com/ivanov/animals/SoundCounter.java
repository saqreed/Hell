package com.ivanov.animals;

import java.util.HashMap;
import java.util.Map;

public class SoundCounter {
    private static final Map<String, Integer> soundCounts = new HashMap<>();

    public static void recordSound(String animalName) {
        soundCounts.put(animalName, soundCounts.getOrDefault(animalName, 0) + 1);
    }

    public static int getSoundCount(String animalName) {
        return soundCounts.getOrDefault(animalName, 0);
    }

    public static void printAllCounts() {
        System.out.println("--- Звуки животных ---");
        for (Map.Entry<String, Integer> entry : soundCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " раз(а)");
        }
    }
}
