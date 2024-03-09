package MultiThreding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientForPrintNumber {

    public static void main(String[] args) {
        for(int i=0; i<=100; i++){
            ExecutorService ex = Executors.newFixedThreadPool(10);
            if(i == 80){
                System.out.println("Do Something");
            }
            PrintNumbers printNumbers = new PrintNumbers(i);
//            Thread thread = new Thread(printNumbers);
//            thread.start();
//            ex.execute(printNumbers);
            Thread thread = new Thread(printNumbers);
            thread.start();


        }
    }
}
