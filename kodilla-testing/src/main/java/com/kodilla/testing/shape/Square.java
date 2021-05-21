package com.kodilla.testing.shape;

public class Square implements Shape {

    private String shapeName;
    private double sideLength;

    public Square(String shapeName, double sideLength) {
        this.shapeName = shapeName;
        this.sideLength = sideLength;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return sideLength*sideLength;
    }
}
