package Java_A2Z.MultiThreading.MonitorLocking;

public class MonitorLockingRunnable implements Runnable{

    MonitorLockingExample obj;
    public MonitorLockingRunnable(MonitorLockingExample obj)
    {
        this.obj = obj;
    }
    @Override
    public void run() {
        obj.task1();
    }

}