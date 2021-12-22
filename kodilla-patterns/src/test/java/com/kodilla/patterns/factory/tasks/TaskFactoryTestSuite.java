package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPINGTASK);

        //Then
        assertEquals("Zakupy w Lidlu", shoppingTask.getTaskName());
        assertEquals(false, shoppingTask.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTINGTASK);
        paintingTask.executeTask();

        //Then
        assertEquals("Malowanie obrazu", paintingTask.getTaskName());
        assertEquals(true, paintingTask.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVINGTASK);
        drivingTask.executeTask();

        //Then
        assertEquals("Odwiedziny", drivingTask.getTaskName());
        assertEquals(true, drivingTask.isTaskExecuted());
    }
}
