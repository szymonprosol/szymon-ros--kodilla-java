package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().getTasks().add("Zrobić zakupy");
        board.getInProgressList().getTasks().add("Posprzątać garaż");
        board.getDoneList().getTasks().add("Zapłacić rachunki");

        //Then
        assertEquals("Zrobić zakupy", board.getToDoList().getTasks().get(0));
        assertEquals("Posprzątać garaż", board.getInProgressList().getTasks().get(0));
        assertEquals("Zapłacić rachunki", board.getDoneList().getTasks().get(0));
        System.out.println(board.getToDoList().getTasks().get(0) + "\n" +
                board.getInProgressList().getTasks().get(0) + "\n" +
                board.getDoneList().getTasks().get(0));
    }
}