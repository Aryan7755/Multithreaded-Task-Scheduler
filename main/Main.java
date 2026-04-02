package main;

import scheduler.TaskScheduler;
import task.Task;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TaskScheduler scheduler = new TaskScheduler(3);

        // Submit priority tasks
        scheduler.submitTask(new Task(1, 2));
        scheduler.submitTask(new Task(2, 5));
        scheduler.submitTask(new Task(3, 1));
        scheduler.submitTask(new Task(4, 4));
    }
}