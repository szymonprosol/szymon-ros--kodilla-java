package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "My first list";

    @Test
    void testFindByListName() {
        // Given
        TaskList taskList = new TaskList(LISTNAME, "This is my first task list");

        // When
        taskListDao.save(taskList);

        // Then
        List<TaskList> readTask = taskListDao.findByListName(LISTNAME);
        assertTrue(readTask.size() == 1);

        // Clenup
        taskListDao.deleteByListName(LISTNAME);
    }

}
