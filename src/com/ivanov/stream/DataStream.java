package com.ivanov.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DataStream<T> {
    private final List<T> data;
    private final List<Runnable> actions;
    private DataStream(List<T> data) {
        this.data = data;
        this.actions = new ArrayList<>();
    }
    public static <T> DataStream<T> of(List<T> data) {
        return new DataStream<>(data);
    }
    public DataStream<T> map(Function<T, T> mapper) {
        actions.add(() -> {
            List<T> result = new ArrayList<>();
            for (T item : data) {
                result.add(mapper.apply(item));
            }
            data.clear();
            data.addAll(result);
        });
        return this;
    }
    public DataStream<T> filter(Predicate<T> predicate) {
        actions.add(() -> {
            List<T> result = new ArrayList<>();
            for (T item : data) {
                if (predicate.test(item)) {
                    result.add(item);
                }
            }
            data.clear();
            data.addAll(result);
        });
        return this;
    }
    public List<T> collect() {
        for (Runnable action : actions) {
            action.run();
        }
        return new ArrayList<>(data);
    }
}