package Java_A2Z.MultiThreading.MonitorLocking;

public class MonitorLockingMain {
    
    public static void main(String args[])
    {
        MonitorLockingExample obj = new MonitorLockingExample();

        MonitorLockingRunnable runnableObj = new MonitorLockingRunnable(obj);
        Thread thread1 = new Thread(runnableObj);
        Thread thread2 = new Thread(()->{obj.task2();});
        Thread thread3 = new Thread(()->{obj.task3();});

        thread1.start();
        thread2.start();
        thread3.start();
    }
}