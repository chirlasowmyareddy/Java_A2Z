package Java_A2Z.MultiThreading.CAS;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource {

    AtomicInteger counter = new AtomicInteger(0);
    // int counter;
    
    public void increment()
    {
        counter.incrementAndGet();
        // counter++;
        /*
        this can give insonsitent results 400 can be outputed as 371 
        for me it is cmng 400 but possibilty is there that some increments can miss
         */
    }

    public int get()
    {
        return counter.get();
        // return counter;
    }

    ThreadPoolExecutor   t= new ThreadPoolExecutor(get(), get(), get(), null, null) ;             
}
