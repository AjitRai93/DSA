package MultiThreding.MergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> array = List.of(5,8,2,66,33,22,77,88,32,92,58);
        Sorter task = new Sorter(array);

        ExecutorService ex = Executors.newCachedThreadPool();

        Future<List<Integer>> listFuture = ex.submit(task);
        List<Integer> finalSortedArray = listFuture.get();
        System.out.println("Final Sorted Array is: "+finalSortedArray);
    }
}
