package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void openSettingsFile() {
        logger = Logger.INSTANCE;
    }

    @Test
    void testGetFileName1() {
        //Given
        //When
        String lastLog = "Aktualizacja sterowników";
        logger.log(lastLog);
        //Then
        assertEquals("Aktualizacja sterowników", lastLog);
    }

    @Test
    void testGetFileName2() {
        //Given
        //When
        String lastLog = "Krytyczny błąd systemu";
        logger.log(lastLog);
        lastLog = "System został zresetowany";
        logger.log(lastLog);
        //Then
        assertEquals("System został zresetowany", lastLog);
    }
}
