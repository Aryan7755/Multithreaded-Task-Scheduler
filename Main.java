public class Main {
    public static void main(String[] args) throws InterruptedException {

        TaskQueue queue = new TaskQueue();

        Worker w1 = new Worker(queue, "Worker-1");
        Worker w2 = new Worker(queue, "Worker-2");

        w1.start();
        w2.start();

        for (int i = 1; i <= 10; i++) {
            queue.addTask(new Task(i));
        }

        Thread.sleep(5000); // let tasks run

        // Shutdown workers
        w1.shutdown();
        w2.shutdown();
    }
}