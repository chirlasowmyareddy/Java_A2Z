package Java_A2Z.MultiThreading.SemaphoreLocking;

public class Main {
    public static void main(String args[])
    {
        SharedResource obj = new SharedResource();
        Thread t1 = new Thread(() -> {
            obj.producer();
        });

        Thread t2 = new Thread(() -> {
            obj.producer();
        });

        Thread t3 = new Thread(() -> {
            obj.producer();
        });

        Thread t4 = new Thread(() -> {
            obj.producer();
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}


/*
For inter thread communication between threads 
await()-->wait()
signal()-->notify()
signalAll-->notifyAll()
*/