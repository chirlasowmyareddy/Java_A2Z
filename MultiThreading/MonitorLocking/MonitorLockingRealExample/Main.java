package Java_A2Z.MultiThreading.MonitorLocking.MonitorLockingRealExample;

public class Main {
    
    public static void main(String args[])
    {
        SharedResource sharedResourceobj = new SharedResource();
        Thread producerThread = new Thread(()->
        {
            try{
                Thread.sleep(3000);
            }catch(Exception e)
            {
                //handle the exception
            }
            sharedResourceobj.addItem();
        });

        Thread consumerThread = new Thread(()->
        {
            sharedResourceobj.consumeItem();
        });

        producerThread.start();
        consumerThread.start();

    }
}