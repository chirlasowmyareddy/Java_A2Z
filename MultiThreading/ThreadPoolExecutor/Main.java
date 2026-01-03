package Java_A2Z.MultiThreading.ThreadPoolExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String args[])
    {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,4,10,TimeUnit.MINUTES,new ArrayBlockingQueue<>(2), new CustomThreadFactory(),new CustomRejectHandler());

        executor.allowCoreThreadTimeOut(true);
        /*
        if this is set to true then only the keepAliveTime will be used otherwise it won't be used
         */
        for(int i = 0 ; i < 7;i++)
        {
            executor.submit(()->{
                try{
                    Thread.sleep(5000);
                }catch(Exception e){
                    //handle exception here
                }
                System.out.println("Task Processed by "+Thread.currentThread().getName());
            });
        }
        executor.shutdown();
    }

    static class CustomThreadFactory implements ThreadFactory{

        @Override
        public Thread newThread(Runnable r) {
            
            Thread th = new Thread(r);
            th.setPriority(Thread.NORM_PRIORITY);
            th.setDaemon(false);

            return th;
        }
        
    }

    static class CustomRejectHandler implements RejectedExecutionHandler {

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            System.out.println("Task Rejected "+ r.toString());
        }
        
    }
    
}
/*
How can we decide the ThreadPool min and max size
-> CPU cores
-> JVM Memory
-> Task Nature (CPU Intensive or I/O Intensive)
-> Concurreny Requirement (Want High,Low or Medium Concurrency)
-> Memory Required to Process a Request
-> Throughput etc

Two types of tasks
CPU Intensive,I/O Intensive
if it is cpu intensive then the task requires more processing time
if it is I/O intensive then the task requires more waiting time 
And it is an iterative process to update these values based on the Monitoring
Formula to find the No. Of Thread(can be a starting point to decide)
Max No Of Thread = No. Of CPU Core * (1 + Request waiting time/processing time)

This formula doesnt consider the memory yet
so after considering the JVM memory and all
lets say JVM : 2GB
    (
        Heap space  :1GB
        Code Cache Space : 128MB
        per Thread Space : 5MB * No of Threads (includes Thread Stack Space)
        JVM Overhead :256MB
    )
for one thread lets say we need 5MB(stack memoery->2mb,registers->1mb etc)
500Mb is there in JVM for threads
so 500/5 = 100 thread
Then lets say we get 100 threads

but now we should consider memory required to process the request
lets say 1 request requires 10Mb of space to fulfill the request(fetching data from db etc)
which would store into the heap space so 10*100 = 1000mb which is 1gb which is full heap space which is not good
sp let's say we can keep 60 to 70% bufeer so lets say 60threads
min thread->60
max thread->64-70
and then do iterative tetsing by load testing and then adjust the sizes
 */