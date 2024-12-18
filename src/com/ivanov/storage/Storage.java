package com.ivanov.storage;

public final class Storage<T> {
    private final T item;
    private static final Storage<?> EMPTY = new Storage<>(null);
    private Storage(T item) {
        this.item = item;
    }

    public static <V> Storage<V> empty() {
        @SuppressWarnings("unchecked")
        Storage<V> emptyStorage = (Storage<V>) EMPTY;
        return emptyStorage;
    }
    public static <V> Storage<V> of(V value) {
        return new Storage<>(value);
    }
    public T getOrElse(T alternative) {
        return item != null ? item : alternative;
    }
}