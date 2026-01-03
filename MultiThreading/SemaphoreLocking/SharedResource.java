package Java_A2Z.MultiThreading.SemaphoreLocking;

import java.util.concurrent.Semaphore;

public class SharedResource {

    boolean isAvailable = false;
    Semaphore lock = new Semaphore(2);
    public void producer()
    {
        try{
            lock.acquire();
            System.out.println("Lock is acquired by "+ Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);

        }catch(Exception e){
            //handle exception here
        }finally{
            System.out.println("Lock released by "+ Thread.currentThread().getName());
            lock.release();
            
        }

    }
}