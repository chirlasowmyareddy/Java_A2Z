package Java_A2Z.MultiThreading.StampedLocking;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.StampedLock;

public class Main {
    public static void main(String args[])
    {
        StampedLock lock =  new StampedLock();
        SharedResource sharedResourceObj = new SharedResource();
        SharedResource sharedResourceObj2 = new SharedResource();

        Thread th1 = new Thread(() ->{
            sharedResourceObj.produce(lock);
        });

        Thread th2 = new Thread(() ->{
            sharedResourceObj.produce(lock);
        });

        Thread th3 = new Thread(() ->{
            sharedResourceObj2.consume(lock);
        });

        th1.start();
        th2.start();
        th3.start();
    }
}

/*
Stamped Lock has capabilities of Read/Write lock and Optimistic Read

pessimistic(acquires lock),Optimistic(no lock acquire)

In optimistic locking whenever we are reading we have to read the state or some version number so we usually need a stamp
*/