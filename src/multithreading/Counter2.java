package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Bogdan
 */
public class Counter2 {

    //atomic counter object is created
    private final AtomicInteger c = new AtomicInteger();

    public final int increment() {
        return c.incrementAndGet();
    }

    public final int decrement() {
        return c.decrementAndGet();
    }

    public int getCount() {
        return c.get();
    }

    String value() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
