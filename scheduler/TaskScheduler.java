package scheduler;

import task.Task;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

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
}


