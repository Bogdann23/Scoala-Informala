package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Bogdan
 */
public class Counter {

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
}
