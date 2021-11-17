package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPINGTASK = "SHPOPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Zakupy w Lidlu", "masło", 2.0);
            case PAINTINGTASK:
                return new PaintingTask("Malowanie obrazu", "żółty", "słońce");
            case DRIVINGTASK:
                return new DrivingTask("Odwiedziny", "u babci", "samochód");
            default:
                return null;
        }
    }
}
