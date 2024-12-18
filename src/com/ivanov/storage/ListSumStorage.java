package com.ivanov.storage;

import com.ivanov.storage.Storage;
import java.util.List;

public class ListSumStorage {

    public String calculateSum(Storage<List<Integer>> storage) {
        List<Integer> numbers = storage.getOrElse(null);

        if (numbers == null || numbers.isEmpty()) {
            return "Список пуст";
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return "Сумма списка: " + sum;
    }
}
