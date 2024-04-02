package Programs.Sort;

import java.util.Arrays;

public class BubbleSort {

    private static void bubbleSort(int[] array) {
        int length = array.length;

        for(int i =0 ; i < length-1; i++){

            for(int j =0; j < length-1-i; j++){

                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        bubbleSort(array);
        System.out.println("Sorted array");
        Arrays.stream(array).forEach(System.out::print);
    }

}
