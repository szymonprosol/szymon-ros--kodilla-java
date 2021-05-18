package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private String shapeName;
    private double baseLength, triangleHight;

    public Triangle(String shapeName, double baseLength, double triangleHight) {
        this.shapeName = shapeName;
        this.baseLength = baseLength;
        this.triangleHight = triangleHight;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return 0.5*baseLength*triangleHight;
    }
}
