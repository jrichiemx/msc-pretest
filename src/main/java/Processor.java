import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by jrichiemx on 7/22/15.
 */
public class Processor<T>
{
    private Queue<T> queueOfTask = new ConcurrentLinkedQueue<>();
    private ExecutorService executor;

    /**
     * Processes requests from the queue with no more than
     * maxThreads threads
     * For each request object calls
     * IRequestHandler<T>.processRequest(o) only once in a separate thread
     * When the queue is empty and all processing is finished
     * no threads exist.
     *
     * @param rh - an object that handles requests
     * @param maxThreads - total number of threads
     */
    public Processor(IRequestHandler<T> rh, int maxThreads)
    {
        queueOfTask.add(rh);
        executor = Executors.newFixedThreadPool(maxThreads);

    }

    private void doProcessing(){

        while(!queueOfTask.isEmpty()){
            executor.execute((Runnable) queueOfTask.poll());
        }
        executor.shutdown();

    }
    /**
     * Puts the request into a queue, does not wait
     * for the request to complete
     * @param o - request object
     */
    public void addRequest(T o)
    {
        queueOfTask.add(o);
    }
    /** OPTIONAL
     * Asynchronous shutdown, returns immediately.
     * Instructs the processor to stop accepting requests
     * and finish existing tasks
     * @param o – if not null, notifies all waiting threads on
     * this object upon successful shutdown
     */
    public void shutDown(Object o)
    {
        executor.
    }
    /** OPTIONAL
     * @returns true if the processor is shut down
     */
    public boolean isShutDown()
    {
        return executor.isShutdown();
    }
}
