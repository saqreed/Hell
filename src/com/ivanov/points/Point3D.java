package com.ivanov.points;

public class Point3D extends Point2D {
    private final int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return String.format("{%d, %d, %d}", getX(), getY(), z);
    }
}
