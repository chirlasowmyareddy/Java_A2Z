package Java_A2Z.MultiThreading.ReadWriteLocking;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
    
    Boolean isAvailable = false;

    public void produce(ReadWriteLock lock)
    {
        try {
            lock.readLock().lock();
            System.out.println("Read lock acquired by "+Thread.currentThread().getName());
            Thread.sleep(8000);
        } catch (Exception e) {
            //handle exception here
        }finally{
            lock.readLock().unlock();
            System.out.println("Read lock released by "+Thread.currentThread().getName());
        
        }
    }

    public void consume(ReadWriteLock lock)
    {
        try {
            lock.writeLock().lock();
            System.out.println("Write lock acquired by "+Thread.currentThread().getName());
            
        } catch (Exception e) {
            //handle exception here
        }finally{
            lock.writeLock().unlock();
            System.out.println("Write lock released by "+Thread.currentThread().getName());
            
        }
    }
}