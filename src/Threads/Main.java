package Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
            thread = a thread of execution
                     JVM allows an application to have multiple threads running concurrently
                     can execute different parts of the code in parallel
                     threads have priority, execution preferring threads with higher priority

            The program stops when:
                1. the exit method is called
                2. all threads have died
         */

        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("PIZZA");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority()); // on a scale 1-10
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority()); // on a scale 1-10
        System.out.println(Thread.currentThread().isAlive());

        for(int i = 3; i > 0; i--){
            System.out.println(i);
            Thread.sleep(20);
        }

        System.out.println("you are done");

        //

        MyThread thread2 = new MyThread();
        System.out.println(thread2.isAlive());
        thread2.start();
        System.out.println(thread2.isAlive());
        System.out.println(thread2.getName());
        thread2.setName("2nd thread");
        System.out.println(thread2.getName());
        System.out.println(thread2.getPriority()); //inherits the priority from the thread that created it
        thread2.setPriority(7);
        System.out.println(thread2.getPriority());

        System.out.println(Thread.activeCount());

        // daemon threads are low priority threads for garbage collection etc.
        // by default threads are not daemon (user thread), but can make them
        System.out.println(thread2.isDaemon());
        thread2.setDaemon(true);
    }
}
