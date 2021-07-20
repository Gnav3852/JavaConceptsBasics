package MutiThreads;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Countdown countdown = new Countdown();

        CountdownThread t1 = new CountdownThread(countdown);
        t1.setName("Thread 1");

        CountdownThread t2= new CountdownThread(countdown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();

    }


}

class Countdown {
    //local var
    //share the obj
    private int i;

    public synchronized void doCount(){
        switch (Thread.currentThread().getName()){
            case "Thread 1":
                System.out.println("CYAN");
                break;
            case "Thread 2":
                System.out.println("PURPLE");
                break;
            default:
                System.out.println("GREEN");
        }
        for(i = 10;i>0;i--){
            System.out.println(Thread.currentThread().getName() + " "+i);

        }
    }
}


class CountdownThread extends Thread {
    private Countdown threadcount;

    public CountdownThread(Countdown countdown){
        threadcount = countdown;
    }


    public void run() {
        threadcount.doCount();
    }
}
