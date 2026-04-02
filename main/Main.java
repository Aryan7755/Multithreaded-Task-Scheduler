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

        // Delayed task
        scheduler.scheduleTask(new Task(101, 3), 3);

        // Repeating task
        scheduler.scheduleAtFixedRate(new Task(200, 1), 1, 5);

        // Let system run for some time
        Thread.sleep(10000);

        // Shutdown
        scheduler.shutdown();
    }
}