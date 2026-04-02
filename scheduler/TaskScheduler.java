package scheduler;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class TaskScheduler {
    private ThreadPoolExecutor executor;
    private ScheduledExecutorService scheduler;
}
