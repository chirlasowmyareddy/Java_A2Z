package Java_A2Z.MultiThreading.MonitorLocking.MonitorLockingRealExample;

public class SharedResource {
    boolean isItempresent = false;

    public synchronized void addItem()
    {
        isItempresent = true;
        System.out.println("Producer Thread calling notify method");
        notifyAll();
    }
    public synchronized void consumeItem()
    {

        System.out.println("Consumer Thread inside conume Item method");
        while(!isItempresent)//to avoid scurious wake up we need to keep while instead of if block
        {
            try{
                System.out.println("Consumer thread is waiting");
                wait();// release all the monitor locks here 
            }catch(Exception e)
            {
                //exception handling
            }
            
        }
        System.out.println("Consumer thread consumed the item");
        isItempresent = false;
    }

}