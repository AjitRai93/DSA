package MultiThreding;

public class EvenAndOddPrintUsingTwoThreadsWaitNotify implements Runnable{
    public static int count =1;
    Object object;
    @Override
    public void run() {
        while(count<=10){
            synchronized (object){
                if(count %2 == 0 && Thread.currentThread().getName().equals("even")){
                    System.out.println("Thread Name: " + Thread.currentThread().getName() + " value: " + count);
                    count++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(count %2 != 0 && Thread.currentThread().getName().equals("odd")){
                    System.out.println("Thread Name: " + Thread.currentThread().getName() + " value: " + count);
                    count++;
                    object.notify();
                }
            }
        }
    }

    public static void main(String[] args) {
        Object object = new Object();
        Runnable r1 = new EvenAndOddPrintUsingTwoThreads(object);
        Runnable r2 = new EvenAndOddPrintUsingTwoThreads(object);

        new Thread(r1,"even").start();
        new Thread(r2,"odd").start();
    }

    public EvenAndOddPrintUsingTwoThreadsWaitNotify(Object object) {
        this.object = object;
    }
}
