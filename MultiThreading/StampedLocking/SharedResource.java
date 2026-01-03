package Java_A2Z.MultiThreading.StampedLocking;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    Boolean isAvailable = false;

    public void produce(StampedLock lock)
    {
        long stamp = lock.readLock();
        System.out.println("Read stamp "+ stamp);
        try {
            System.out.println("Read lock acquired by "+Thread.currentThread().getName());
            Thread.sleep(8000);
        } catch (Exception e) {
            //handle exception here
        }finally{
            lock.unlockRead(stamp);
            System.out.println("Read lock released by "+Thread.currentThread().getName());
        
        }
    }

    public void consume(StampedLock lock)
    {
        long stamp = lock.writeLock();
        System.out.println("Write stamp "+stamp);
        try {
            System.out.println("Write lock acquired by "+Thread.currentThread().getName());
            
        } catch (Exception e) {
            //handle exception here
        }finally{
            lock.unlockWrite(stamp);
            System.out.println("Write lock released by "+Thread.currentThread().getName());
            
        }
    }
}
