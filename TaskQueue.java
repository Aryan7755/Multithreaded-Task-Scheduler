import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TaskQueue{
    private BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
}
