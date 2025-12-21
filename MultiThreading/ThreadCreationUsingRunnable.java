package Java_A2Z.MultiThreading;

public class ThreadCreationUsingRunnable implements Runnable{

    @Override
    public void run()
    {
        System.out.println("Code executed by thread1 "+Thread.currentThread().getName());
    }
}