public class Task implements Runnable{
    private int taskId;
    private TaskStatus status;
    public Task(int taskId) {
        this.taskId = taskId;
        this.status = TaskStatus.PENDING;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " started by " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // simulate work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task " + taskId + " completed by " + Thread.currentThread().getName());
    }
}
