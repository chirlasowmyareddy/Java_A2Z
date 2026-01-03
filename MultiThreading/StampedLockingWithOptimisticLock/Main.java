package Java_A2Z.MultiThreading.StampedLockingWithOptimisticLock;

public class Main {
    public static void main(String args[])
    {
        SharedResource obj = new SharedResource();
        
        Thread th1 = new Thread(() -> {
            obj.producer();
        });

        Thread th2 = new Thread(() -> {
            obj.consumer();
        });

        th1.start();
        // th2.start();
        // if this is uncommented we can see the roll back happens
    }
}