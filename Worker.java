public class Worker extends Thread{
    private TaskQueue taskQueue;

    public Worker(TaskQueue taskQueue, String name) {
        super(name);
        this.taskQueue = taskQueue;
    }

}
