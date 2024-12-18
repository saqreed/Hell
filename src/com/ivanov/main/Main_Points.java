package com.ivanov.main;

import com.ivanov.points.Line;
import com.ivanov.points.Point2D;
import com.ivanov.points.Point3D;

public class Main_Points {
    public static void main(String[] args) {
        Point3D point1 = new Point3D(1, 2, 3);
        Point3D point2 = new Point3D(4, 5, 6);

        Line<Point3D> line3D = new Line<>(point1, point2);
        System.out.println("Линия в 3D: " + line3D);


        Point2D point3 = new Point2D(1, 2);
        Point2D point4 = new Point2D(3, 4);

        Line<Point2D> line2D = new Line<>(point3, point4);
        System.out.println("Линия в 2D: " + line2D);
    }
}
