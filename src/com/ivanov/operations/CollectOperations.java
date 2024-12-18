package com.ivanov.operations;

import com.ivanov.points.Point2D;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CollectOperations {
    public static List<Point2D> collect(List<Point2D> points, Predicate<Point2D> condition) {
        List<Point2D> result = new ArrayList<>();
        for (Point2D point : points) {
            if (condition.test(point)) {
                result.add(point);
            }
        }
        return result;
    }
}
