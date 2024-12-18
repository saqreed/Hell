package com.ivanov.operations;

import com.ivanov.points.Line;
import com.ivanov.points.Point2D;

public class LineOperations {
    public static <T extends Point2D> void shiftLineStart(Line<T> line) {
        T startPoint = line.getStart();
        Point2D shiftedPoint = new Point2D(startPoint.getX() + 10, startPoint.getY());
        line.setStart((T) shiftedPoint);
    }
}
