package Java_A2Z.MultiThreading.MonitorLocking.DeadLockUsingSuspend;

public class Main {
    public static void main(String args[])
    {
        SharedResource obj = new SharedResource();

        System.out.println("Main thread started");

        Thread thread1 = new Thread(() -> {
            System.out.println("Thread1 calling produce method");
            obj.produce();
        });

        Thread thread2 = new Thread(() -> {

            try {
                Thread.sleep(1000);
            } 
            catch (Exception e) {
                // TODO: handle exception
            }
            System.out.println("thread2 calling produce method");
            obj.produce();
        });

        thread1.start();
        thread2.start();

        try {
                Thread.sleep(3000);
            } 
            catch (Exception e) {
                // TODO: handle exception
            }
        System.out.println("thread1 is suspended");
        thread1.suspend();

        try {
                Thread.sleep(3000);
            } 
            catch (Exception e) {
                // TODO: handle exception
            }
        System.out.println("thread is resumed again ");
        thread1.resume(); 

        try{
            thread2.join();// this makes main wait untill the desired thread completes its work then only main thread will be stopped
        }catch(Exception e){
            // hanlde exception here
        }
        System.out.println("main thread is finishing its work");
    }
}
