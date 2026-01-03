package Java_A2Z.MultiThreading.ReentrantLocking;


import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    
    boolean isAvailable = false;
    public void produce(ReentrantLock lock)
    {
        try{
            lock.lock();
            System.out.println("Lock acquired by "+ Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        }
        catch(Exception e){
            // handle exception here
        }
        finally{
            
            System.out.println("Lock released by thread "+ Thread.currentThread().getName());
            lock.unlock();
        }
    }
}