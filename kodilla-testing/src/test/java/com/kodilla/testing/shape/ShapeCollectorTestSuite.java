package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Collector Test Suite")

class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.\n");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter + "\n");
    }

    @Nested
    @DisplayName("Tests for figures")
    class TestFigures {

        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle("pierwszeKolo", 10);
            //When
            shapeCollector.addFigure(circle);
            //Then
            Assertions.assertEquals(1, shapeCollector.getShapesQuantity());
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle("pierwszekolo", 10);
            shapeCollector.addFigure(circle);
            //When
            boolean result = shapeCollector.removeFigure(circle);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getShapesQuantity());
        }

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle("pierwszekolo", 10);
            shapeCollector.addFigure(circle);
            //When
            Shape shape = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals("pierwszekolo", shape.getShapeName());
            Assertions.assertEquals(314, shape.getField());
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle("pierwszekolo", 10));
            shapeCollector.addFigure(new Circle("drugiekolo", 15));
            shapeCollector.addFigure(new Square("pierwszykwadrat", 10));
            shapeCollector.addFigure(new Square("drugikwadrat", 12));
            shapeCollector.addFigure(new Triangle("pierwszytrojkat", 10, 7));
            shapeCollector.addFigure(new Triangle("drugitrojkat", 12, 6));
            //When
            String figures = shapeCollector.showFigures();
            //Then
            String expected = "pierwszekolo, drugiekolo, pierwszykwadrat, drugikwadrat, pierwszytrojkat, drugitrojkat";
            Assertions.assertEquals(expected, figures);
        }
    }
}
