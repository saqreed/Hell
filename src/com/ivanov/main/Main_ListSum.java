package com.ivanov.main;

import com.ivanov.storage.Storage;
import com.ivanov.storage.ListSumStorage;

import java.util.Arrays;
import java.util.List;

public class Main_ListSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Storage<List<Integer>> storageWithNumbers = Storage.of(numbers);
        ListSumStorage listSumStorage = new ListSumStorage();
        System.out.println(listSumStorage.calculateSum(storageWithNumbers));

        List<Integer> emptyList = Arrays.asList();
        Storage<List<Integer>> storageWithEmptyList = Storage.empty();
        System.out.println(listSumStorage.calculateSum(storageWithEmptyList));
    }
}
