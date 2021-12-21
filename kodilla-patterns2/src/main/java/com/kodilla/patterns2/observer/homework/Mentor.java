package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.ForumTopic;
import com.kodilla.patterns2.observer.forum.Observer;

public class Mentor implements TasksObserver {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(TasksQueue tasksQueue) {
        System.out.println(username + ": New tasks from the student " + tasksQueue.getName() + "\n" +
                " (total: " + tasksQueue.getTasks().size() + " tasks)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
