package Java_A2Z.MultiThreading.ReadWriteLocking;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    
    public static void main(String args[])
    {
        ReadWriteLock lock =  new ReentrantReadWriteLock();
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
Shared Lock(Read Lock)->More than 1 thread can acquire lock
If T1 kept shared lock then T2 can keep a shared lock
If T1 kept shared lock then T2 cannot keep an exclusive lock

Exclusive Lock(Write Lock)->Only 1 thread can acquire the write lock
If T1 kept exclusive lock then T2 cannot keep a shared lock
If T1 kept exclusive lock then T2 cannot keep an exclusive lock


When to use this?
When reads are very high compared to write requests
*/