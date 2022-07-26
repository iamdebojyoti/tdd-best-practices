package com.tddsessions.session3.task;


import static com.tddsessions.session3.task.TaskStatus.*;

public class TaskV2 {
    private Long id;
    private String title;
    private TaskStatus status;

    public TaskV2(Long id, String title) {
        this.id = id;
        this.title = title;
        this.status = LISTED;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void start() {
        if(!this.title.equals("Approvable Task")) {
            this.status = IN_PROGRESS;
        }
    }

    public void finish() {
        this.status = COMPLETE;
    }
}
