/*
package com.ivanov.main;

import com.ivanov.operations.FunctionOperations;

import java.util.Arrays;
import java.util.List;

public class Main_631 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("qwerty", "asdfg", "zx");
        List<Integer> lengths = FunctionOperations.applyFunction(strings, String::length);
        System.out.println("Длины строк: " + lengths); // [6, 5, 2]
        List<Integer> numbers = Arrays.asList(1, -3, 7);
        List<Integer> positiveNumbers = FunctionOperations.applyFunction(numbers, Math::abs);
        System.out.println("Положительные числа: " + positiveNumbers); // [1, 3, 7]
        List<int[]> arrays = Arrays.asList(new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{-1, -2, -3});
        List<Integer> maxValues = FunctionOperations.applyFunction(arrays, arr -> Arrays.stream(arr).max().orElseThrow());
        System.out.println("Максимальные значения: " + maxValues); // [3, 6, -1]
    }
}
 */