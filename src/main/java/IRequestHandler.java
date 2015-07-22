/**
 * Created by jrichiemx on 7/22/15.
 */
public interface IRequestHandler<T>
{
    /**
     * A thread-safe method to process a single request
     * @param o - request object
     */
    void processRequests(T o) throws Exception;
}