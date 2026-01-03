package Java_A2Z.MultiThreading.ReentrantLocking;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    /*
    This is how locks can be put to different objects without using synchronized as synchronized will only work if we are
    working on only one single objects and wanted to keep locks which is monitor locking(locks)
     */    
    public static void main(String args[])
    {
        ReentrantLock lock = new ReentrantLock();
        SharedResource obj1 = new SharedResource();

        Thread th1 = new Thread(() ->{
            obj1.produce(lock);
        });

        SharedResource obj2 = new SharedResource();
        Thread th2 = new Thread(() ->{
            obj2.produce(lock);
        });

        th1.start();
        th2.start();
    }
}