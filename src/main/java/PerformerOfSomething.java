/**
 * Created by jrichiemx on 7/22/15.
 */
public class PerformerOfSomething implements IRequestHandler, Runnable {
    @Override
    public void processRequests(Object o) throws Exception {
        System.out.println("this object does "  + toString());
    }

    @Override
    public void run(){
        try {
            this.processRequests("RUNS");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
