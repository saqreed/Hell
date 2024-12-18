package com.ivanov.main;

import com.ivanov.operations.PolylineOperations;
import com.ivanov.points.Point2D;

import java.util.Arrays;
import java.util.List;

public class Main_Poles {
    public static void main(String[] args) {
        List<Point2D> points = Arrays.asList(
                new Point2D(-10, 3),
                new Point2D(0, 5),
                new Point2D(2, -4),
                new Point2D(7, 8)
        );
        List<Point2D> polyline = PolylineOperations.createPolyline(points);
        System.out.println(polyline);
    }
}