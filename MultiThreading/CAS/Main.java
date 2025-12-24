package Java_A2Z.MultiThreading.CAS;

public class Main {
    
    public static void main(String args[])
    {
        SharedResource obj = new SharedResource();

        Thread th1 = new Thread(() -> {
            for(int i = 0 ; i < 200 ; i++)
            {
                obj.increment();
            }
        });

        Thread th2 = new Thread(() -> {
            for(int  i= 0 ; i<200;i++){
                obj.increment();
            }
        });

        th1.start();
        th2.start();

        try{
            th1.join();
            th2.join();
        }catch(Exception e){
            //handle exception here
        }

        System.out.println(obj.get());
    }
}
