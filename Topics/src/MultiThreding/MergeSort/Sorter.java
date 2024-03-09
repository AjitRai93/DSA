package MultiThreding.MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//We need to get sorted arrays  in return from our tsk
public class Sorter implements Callable<List<Integer>> {

    private List<Integer> arrayToSort;

    public Sorter(List<Integer> arrayToSort) {
        this.arrayToSort = arrayToSort;
    }

    @Override
    public List<Integer> call() throws Exception {
        if( arrayToSort.size() <=1 ){
            return arrayToSort;
        }

        int mid = arrayToSort.size()/2;
        List<Integer> leftSortedArray = new ArrayList<>();
        List<Integer> rightSortedArray = new ArrayList<>();

        for (int i =0; i< mid; i++){
            leftSortedArray.add(arrayToSort.get(i));
        }

        for(int i = mid; i < arrayToSort.size(); i++){
            rightSortedArray.add(arrayToSort.get(i));
        }

        Sorter leftArraySorter = new Sorter(leftSortedArray);
        Sorter rightArraySorter = new Sorter(rightSortedArray);

        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<List<Integer>> leftSortedArrayFuture = executorService.submit(leftArraySorter);
        Future<List<Integer>> rightSortedArrayFuture = executorService.submit(rightArraySorter);

        List<Integer> sortedLeftArray = leftSortedArrayFuture.get();
        List<Integer> sortedRightArray = rightSortedArrayFuture.get();

        //Merge Code
        int i = 0;
        int j = 0;

        List<Integer> finalSortedArray = new ArrayList<>();

        while (i < sortedLeftArray.size() && j < sortedRightArray.size()){
            if(sortedLeftArray.get(i) <= sortedRightArray.get(j)){
                finalSortedArray.add(sortedLeftArray.get(i));
                i += 1;
            } else {
                finalSortedArray.add(sortedRightArray.get(j));
                j += 1;
            }
        }

        while (i < sortedLeftArray.size()){
            finalSortedArray.add(sortedLeftArray.get(i));
            i +=1;
        }

        while (j < sortedRightArray.size() ){
            finalSortedArray.add(sortedRightArray.get(j));
            j +=1;
        }

        return finalSortedArray;
    }
}
