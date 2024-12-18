package com.ivanov.operations;

import java.util.List;
import java.util.function.BiFunction;

public class ReduceOperations {

    public static <T> T reduceList(List<T> list, BiFunction<T, T, T> accumulator) {
        if (list == null || list.isEmpty()) {
            return null;
        }

        T result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            result = accumulator.apply(result, list.get(i));
        }
        return result;
    }
}