package Java_A2Z.MultiThreading.MonitorLocking.ProducerConsumerProblem;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    
    //declaration of queue here 
    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResource(int bufferSize)
    {
        sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void addToBuffer(int item) throws Exception
    {
        // logic for adding the data to the queue
        while(sharedBuffer.size()== bufferSize)
        {
            System.out.println("buffer is full producer is waiting for consumer to consume");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("Produced the item: "+ item);
        notify();

    }

    public synchronized int consumeTheBuffer() throws Exception
    {
        // logic for consuming the data from the queue

        while(sharedBuffer.isEmpty())
        {
            System.out.println("Buffer is empty so waiting for the producer to produce");
            wait();
        }
        int item = sharedBuffer.poll();
        System.out.println("consumed item: "+item);
        notify();
        return item;
    }
}
