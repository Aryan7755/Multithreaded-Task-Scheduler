public class Task implements Runnable{
    private int taskId;
    private TaskStatus status;
    public Task(int taskId) {
        this.taskId = taskId;
        this.status = TaskStatus.PENDING;
    }

    @Override
    public void run() {
        status = TaskStatus.RUNNING;
        System.out.println("Task " + taskId + " is " + status + " on " + Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Task " + taskId + " interrupted");
            Thread.currentThread().interrupt(); // good practice
        }

        status = TaskStatus.COMPLETED;
        System.out.println("Task " + taskId + " is " + status + " on " + Thread.currentThread().getName());
    }
}
