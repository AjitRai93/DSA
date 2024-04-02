package Programs.Sort;

import java.util.Arrays;

public class SelectionSort {

    private static void selectionSort(int[] arr) {
        for(int i =0; i < arr.length-1;i++){
            int minIndex = i;

            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {99,4,6,2,3,55,7,88,8,2};
        selectionSort(arr);
        System.out.println("Sorted array");
        Arrays.stream(arr).forEach(System.out::print);
    }
}
