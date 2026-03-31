public class Main {
    public static void main(String[] args) {

        TaskQueue queue = new TaskQueue();

        // Create workers
        Worker w1 = new Worker(queue, "Worker-1");
        Worker w2 = new Worker(queue, "Worker-2");
        Worker w3 = new Worker(queue, "Worker-3");

        // Start threads
        w1.start();
        w2.start();
        w3.start();

        // Add tasks
        for (int i = 1; i <= 10; i++) {
            queue.addTask(new Task(i));
        }
    }
}
