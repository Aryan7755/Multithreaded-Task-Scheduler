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

    // Schedule repeating task
    public void scheduleAtFixedRate(Task task, int initialDelay, int period) {
        scheduler.scheduleAtFixedRate(task, initialDelay, period, TimeUnit.SECONDS);
    }

    // Graceful shutdown
    public void shutdown() {
        executor.shutdown();
        scheduler.shutdown();

        try {
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
            if (!scheduler.awaitTermination(5, TimeUnit.SECONDS)) {
                scheduler.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            scheduler.shutdownNow();
        }

        System.out.println("Scheduler shut down successfully.");
    }
}


