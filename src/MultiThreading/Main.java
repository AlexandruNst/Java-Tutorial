package MultiThreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
            multithreading = executing multiple threads simultaneously
                             threads are independent, they do not affect each other's execution
                             an exception in one thread will not interrupt another thread, for example
                             useful for serving multiple clients, multiplayer games etc.
         */

        MyThread thread1 = new MyThread(); //way 1 of creating a thread

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1); //way 2 of creating a thread

        thread1.start();
        thread1.join(); //only starts thread2 after thread1 is done. basically, wait for thread1 to die before continuing
        thread1.join(3000); //only starts thread2 after 3000ms after thread1 started. basically, delay start of thread2
        thread2.start();

        thread1.setDaemon(true);
        thread2.setDaemon(true); //the JVM will continue until all user threads are over. if these are daemon,
                                 //and, say, main thread has an exception, JVM will NOT wait for these threads to finish. It'll just exit
    }
}
