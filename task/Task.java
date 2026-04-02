package task;

public class Task implements Runnable{
    private int taskId;
    private int priority;
    private TaskStatus status;
    public Task(int taskId, int priority) {
        this.taskId = taskId;
        this.priority = priority;
        this.status = TaskStatus.PENDING;
    }

    @Override
    public void run() {
        status = TaskStatus.RUNNING;
        System.out.println("task.Task " + taskId + " is " + status + " on " + Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("task.Task " + taskId + " interrupted");
            Thread.currentThread().interrupt(); // good practice
        }

        status = TaskStatus.COMPLETED;
        System.out.println("task.Task " + taskId + " is " + status + " on " + Thread.currentThread().getName());
    }
}
