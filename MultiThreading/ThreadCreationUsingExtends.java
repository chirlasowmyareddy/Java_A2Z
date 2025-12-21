package Java_A2Z.MultiThreading;

public class ThreadCreationUsingExtends extends Thread{
    
    @Override
    public void run()
    {
        System.out.println("Code executed by thread2 "+Thread.currentThread().getName());
    }
}