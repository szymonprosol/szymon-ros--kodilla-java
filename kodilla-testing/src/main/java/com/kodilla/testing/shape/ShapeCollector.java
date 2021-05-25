package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private Shape shape;
    private List<Shape> shapes= new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public int getShapesQuantity() {
        return shapes.size();
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        if(n >= 0 && n < shapes.size()){
            return shapes.get(n);
        }
        return null;
    }

    public String showFigures() {
        String figures = "";
        if(shapes.size() > 0) {
            for (int i = 0; i < shapes.size(); i++) {
                if(i == 0) {
                    figures = shapes.get(i).getShapeName();
                } else {
                    figures += ", " + shapes.get(i).getShapeName();
                }
            }
        }
        return figures;
    }
}
