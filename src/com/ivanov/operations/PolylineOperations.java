package com.ivanov.operations;

import com.ivanov.points.Point2D;
import com.ivanov.stream.DataStream;

import java.util.List;

public class PolylineOperations {

    public static List<Point2D> createPolyline(List<Point2D> points) {
        return DataStream.of(points)
                .map(point -> new Point2D(point.getX() + 5, point.getY()))
                .filter(point -> point.getX() >= 0)
                .collect();
    }
}