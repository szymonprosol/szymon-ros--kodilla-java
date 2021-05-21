package com.kodilla.testing.shape;

class Circle implements Shape{

    private String shapeName;
    private double radius;
    private double pi = 3.14;

    public Circle(String shapeName, double radius) {
        this.shapeName = shapeName;
        this.radius = radius;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return pi*(radius*radius);
    }
}
