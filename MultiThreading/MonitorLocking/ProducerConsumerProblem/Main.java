package Java_A2Z.MultiThreading.MonitorLocking.ProducerConsumerProblem;

/*
Two threads a producer and consumer, share a common ,fixed-size buffer as a queue
a producer job is to generate data and put it to the buffer and consumer's job is to consumer the data from teh buffer
the problem is to make sure that the producer won't produce data if the buffer is full , and consumer won't consume data
if the buffer is empty.
*/
public class Main {
    public static void main(String args[])
    {
        SharedResource obj = new SharedResource(3);

        Thread producer = new Thread(()->{
            try{
                for(int i = 1 ;i <= 6 ;i++)
                {
                    obj.addToBuffer(i);
                }
            }
            catch(Exception e){
                //hanlding the exception at this level
            }
        });

        Thread consumer = new Thread(()->{
            try {
                for(int i = 1 ;i <= 6 ;i++)
                {
                    obj.consumeTheBuffer();
                }
            } catch (Exception e) {
                //exception is handled here
            }
            
        });

        producer.start();
        consumer.start();
    }
}
