package Java_A2Z.MultiThreading.MonitorLocking;

public class MonitorLockingExample {
    
    public synchronized void task1()
    {
        System.out.println("inside task1");
        try 
        {
            Thread.sleep(10000);
        } 
        catch (InterruptedException e) 
        {    
        }
        System.out.println("Task1 completed");
    }

    public void task2()
    {
        System.out.println("task2 but before synchronization");
        synchronized(this)
        {
            System.out.println("task 2 inside synchronization");
        }
    }

    public void task3()
    {
        System.out.println("task 3 execution completed");
    }

}