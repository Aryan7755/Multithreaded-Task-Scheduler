import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TaskQueue{
    private BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();

    public void addTask(Runnable task) {
        try {
            queue.put(task);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
