package Java_A2Z.MultiThreading.CAS;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource {

    // AtomicInteger counter = new AtomicInteger(0);
    int counter;
    
    public void increment()
    {
        // counter.incrementAndGet();
        counter++;
    }

    public int get()
    {
        // return counter.get();
        return counter;
    }
}
