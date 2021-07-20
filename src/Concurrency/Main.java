package Concurrency;

public class Main {
    public static void main(String[] args) {


        System.out.println("Main Thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("ANOTHER THREAD");
        anotherThread.start();
        //if u do .run() ^^^ its on the main thread


        //this runs in the background
        new Thread(){
            public void run() {
                System.out.println("Anonymous class");
            }
        }.start();


        //most used
//        Thread myRunablleThr = new Thread(new MyRunnable());
        Thread myRunablleThr = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println("HEELLO from runnable run()");
                try{
                    //wait for anotherthread to end
                    anotherThread.join();
                    System.out.println("anotherthread tminated or tim out so im running again");
                } catch(InterruptedException e){
                    System.out.println("I could wait. interrupted");
                }
            }
        });


        myRunablleThr.start();
//        anotherThread.interrupt();

        System.out.println("Main Thread 2 ");

        //cant start the same thread again
        //anotherThread.start();



    }
}
