package com.tddsessions.session3.task;

import org.junit.jupiter.api.Test;

import static com.tddsessions.session3.task.TaskStatus.*;
import static org.junit.jupiter.api.Assertions.*;

class TaskV2Test {
    @Test
    void should_returnStatusAsLISTED_WhenNewTaskIsCreated() {
        Long taskId = 1L;
        String title = "Approvable Task";
        TaskV2 task = new TaskV2(taskId, title);

        assertEquals(LISTED, task.getStatus());
    }

    @Test
    void should_returnStatusAsLISTED_WhenApprovableTaskIsStarted() {
        Long taskId = 1L;
        String title = "Approvable Task";
        TaskV2 task = new TaskV2(taskId, title);

        task.start();

        assertEquals(LISTED, task.getStatus());
    }

    @Test
    void should_returnStatusAsIN_PROGRESS_WhenTaskIsStarted() {
        Long taskId = 1L;
        String title = "Non Approvable Task";
        TaskV2 task = new TaskV2(taskId, title);

        task.start();

        assertEquals(IN_PROGRESS, task.getStatus());
    }

    @Test
    void should_returnStatusAsCOMPLETED_WhenTaskIsFinished() {
        Long taskId = 1L;
        String title = "Approvable Task";
        TaskV2 task = new TaskV2(taskId, title);

        task.start();
        task.finish();

        assertEquals(COMPLETE, task.getStatus());
    }
}