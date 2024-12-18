package com.ivanov.utils;

import java.util.List;

public class ListSumCalculator {
    public String calculateSum(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return "Сумма пустого списка: 0";
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return "Сумма списка: " + sum;
    }
}