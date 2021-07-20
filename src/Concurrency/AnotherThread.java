package Concurrency;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(currentThread().getName());
        try{
            Thread.sleep(3000);
        } catch(InterruptedException e){
            System.out.println("ANother thre woke up");
            //terminate
            return;
        }

        System.out.println("3 sec awake");
    }
}
