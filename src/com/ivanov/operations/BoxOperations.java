package com.ivanov.operations;

import com.ivanov.box.Box;
import com.ivanov.points.Point3D;

import java.util.List;

public class BoxOperations {
    public static double findMaxValue(List<Box<? extends Number>> boxes) {
        return boxes.stream()
                .filter(box -> !box.isEmpty())
                .map(box -> box.get().doubleValue())
                .max(Double::compareTo)
                .orElseThrow(() -> new IllegalArgumentException("Список коробок пуст"));
    }
    public static void setStartPoint(Box<?> box) {
        if (box.isEmpty()) {
            Point3D point = new Point3D(0, 0, 0);
            @SuppressWarnings("unchecked")
            Box<Object> objectBox = (Box<Object>) box;
            objectBox.put(point);
        } else {
            throw new IllegalStateException("Коробка уже заполнена");
        }
    }
}
