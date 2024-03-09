package MultiThreding;

public class EvenAndOddPrintUsingTwoThreads implements Runnable{
    static int count = 1;
    Object lock;

    public static void main(String[] args) {
        Object lock = new Object();
        Runnable runnable1 = new EvenAndOddPrintUsingTwoThreads(lock);
        Runnable runnable2 = new EvenAndOddPrintUsingTwoThreads(lock);

        new Thread(runnable1,"even").start();
        new Thread(runnable2,"odd").start();
    }

    public EvenAndOddPrintUsingTwoThreads(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while(count <= 10){
            synchronized (lock) {
                if ((count % 2 == 0 && Thread.currentThread().getName().equals("even")) ||
                        (count % 2 != 0 && Thread.currentThread().getName().equals("odd"))) {
                    System.out.println("Thread Name: " + Thread.currentThread().getName() + " value: " + count);
                    count++;
                    lock.notify();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
