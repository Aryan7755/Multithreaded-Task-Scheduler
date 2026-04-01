public class Worker extends Thread{
    private TaskQueue taskQueue;
    private volatile boolean running = true;

    public Worker(TaskQueue taskQueue, String name) {
        super(name);
        this.taskQueue = taskQueue;
    }

    public void run() {
        while (true) { // infinite loop
            Runnable task = taskQueue.getTask();
            if (task != null) {
                task.run();
            }
        }
    }
}
