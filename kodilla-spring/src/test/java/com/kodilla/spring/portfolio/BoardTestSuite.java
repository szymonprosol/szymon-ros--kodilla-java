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
        board.toDoList.tasks.add("Zrobić zakupy");
        board.inProgressList.tasks.add("Posprzątać garaż");
        board.doneList.tasks.add("Zapłacić rachunki");

        //Then
        assertEquals("Zrobić zakupy", board.toDoList.tasks.get(0));
        assertEquals("Posprzątać garaż", board.inProgressList.tasks.get(0));
        assertEquals("Zapłacić rachunki", board.doneList.tasks.get(0));
        System.out.println(board.toDoList.tasks.get(0) + "\n" +
                board.inProgressList.tasks.get(0) + "\n" +
                board.doneList.tasks.get(0));
    }
}