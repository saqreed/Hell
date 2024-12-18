package com.ivanov.main;

import com.ivanov.box.Box;
import com.ivanov.operations.*;
import com.ivanov.points.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_62 {
    public static void main(String[] args) {
        Line<Point2D> line = new Line<>(new Point2D(5, 5), new Point2D(10, 10));
        LineOperations.shiftLineStart(line);
        System.out.println("Сдвинутая линия: " + line);

        Box<Integer> box1 = new Box<>();
        box1.put(5);
        Box<Double> box2 = new Box<>();
        box2.put(7.5);
        Box<Float> box3 = new Box<>();
        box3.put(3.2f);
        List<Box<? extends Number>> boxes = Arrays.asList(box1, box2, box3);
        System.out.println("Максимальное значение: " + BoxOperations.findMaxValue(boxes));

        Box<Object> box = new Box<>();
        BoxOperations.setStartPoint(box);
        System.out.println("Начальная точка: " + box.get());
        /*
        List<Number> numbers = new ArrayList<>();
        ListOperations.fillList(numbers);
        System.out.println("Список чисел: " + numbers);

         */
    }
}
