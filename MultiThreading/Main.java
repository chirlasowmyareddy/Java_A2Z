package Java_A2Z.MultiThreading;

public class Main{
    public static void main(String args[])
    {
        System.out.println(Thread.currentThread().getName());
        // creation of thread using runnable interface
        ThreadCreationUsingRunnable runnableObj1 = new ThreadCreationUsingRunnable();
        Thread thread = new Thread(runnableObj1);
        thread.start();
        // creation of thread by extending Thread class
        ThreadCreationUsingExtends runnableObj2 = new ThreadCreationUsingExtends();
        runnableObj2.start();
        System.out.println(Thread.currentThread().getName());

    }
}