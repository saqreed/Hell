package com.ivanov.operations;

import com.ivanov.points.Point2D;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionOperations {

    public static List<Point2D> applyFunction(List<Point2D> points, Function<Point2D, Point2D> function) {
        List<Point2D> result = new ArrayList<>();
        for (Point2D point : points) {
            result.add(function.apply(point));
        }
        return result;
    }
}
