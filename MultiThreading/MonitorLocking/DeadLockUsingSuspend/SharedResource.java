package Java_A2Z.MultiThreading.MonitorLocking.DeadLockUsingSuspend;

public class SharedResource {
    boolean isAvailable  =  false;

    public synchronized void produce()
    {

        System.out.println("Lock acquired");
        isAvailable = true;

        try{
            Thread.sleep(8000);
        }catch(Exception e){
            //handle exception here
        }

        System.out.println("Lock release");
    }
}
