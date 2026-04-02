package scheduler;

import task.Task;

import java.util.concurrent.*;

public class TaskScheduler {
    private ThreadPoolExecutor executor;
    private ScheduledExecutorService scheduler;

    public TaskScheduler(int poolSize) {
        executor = new ThreadPoolExecutor(
                poolSize,
                poolSize,
                0L,
                TimeUnit.MILLISECONDS,
                new PriorityBlockingQueue<>()
        );

        scheduler = Executors.newScheduledThreadPool(2);
    }

    // Submit normal / priority task
    public void submitTask(Task task) {
        executor.execute(task);
    }

    // Schedule task with delay
    public void scheduleTask(Task task, int delaySeconds) {
        scheduler.schedule(task, delaySeconds, TimeUnit.SECONDS);
    }
}


