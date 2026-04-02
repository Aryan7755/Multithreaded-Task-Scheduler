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


    public int compareTo(Task other) {
        return Integer.compare(other.priority, this.priority); // higher priority first
    }

    @Override
    public void run() {
        status = TaskStatus.RUNNING;
        System.out.println("Task " + taskId + " [Priority: " + priority + "] is RUNNING on "
                + Thread.currentThread().getName());

        try {
            Thread.sleep(1000); // simulate work
        } catch (InterruptedException e) {
            System.out.println("Task " + taskId + " interrupted");
            Thread.currentThread().interrupt();
        }

        status = TaskStatus.COMPLETED;
        System.out.println("Task " + taskId + " is COMPLETED on "
                + Thread.currentThread().getName());
    }
}
