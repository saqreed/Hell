package com.ivanov.main;

import com.ivanov.operations.ReduceOperations;

import java.util.Arrays;
import java.util.List;

public class Main_633 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("qwerty", "asdfg", "zx");

        String concatenated = ReduceOperations.reduceList(strings, (s1, s2) -> s1 + s2);
        System.out.println("Объединенная строка: " + concatenated); // qwertyasdfgzx

        List<Integer> numbers = Arrays.asList(1, -3, 7);

        int sum = ReduceOperations.reduceList(numbers, Integer::sum);
        System.out.println("Сумма чисел: " + sum); // 5

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );
        int totalCount = ReduceOperations.reduceList(listOfLists, (list1, list2) -> {
            list1.addAll(list2);
            return list1;
        }).size();
        System.out.println("Общее количество элементов: " + totalCount); // 8
    }
}