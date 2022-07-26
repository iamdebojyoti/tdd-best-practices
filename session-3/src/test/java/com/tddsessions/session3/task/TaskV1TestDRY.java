package com.tddsessions.session3.task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.tddsessions.session3.task.TaskStatus.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskV1TestDRY {

    private TaskV1 task;

    @BeforeEach
    private void setup() {
        Long taskId = 1L;
        String title = "Approvable Task";
        task = new TaskV1(taskId, title);
    }

    @Test
    void should_returnStatusAsLISTED_WhenNewTaskIsCreated() {
        assertEquals(LISTED, task.getStatus());
    }

    @Test
    void should_returnStatusAsIN_PROGRESS_WhenTaskIsStarted() {
        task.start();

        assertEquals(IN_PROGRESS, task.getStatus());
    }

    @Test
    void should_returnStatusAsCOMPLETED_WhenTaskIsFinished() {
        task.finish();

        assertEquals(COMPLETE, task.getStatus());
    }
}