package Programs.Arrays;

import java.util.Arrays;

public class LeftRotateOptimisedApproach {

    public static void main(String[] args) {
        int[] array = {9,5,2,4,7,3,11,26};
        int n = array.length-1;
        int d = 3;
        leftRotateArray(array,n,d);
        Arrays.stream(array).forEach(System.out::print);
    }

    private static void leftRotateArray(int[] array, int n,int d) {
        reverseArray(array, 0,d-1);
        reverseArray(array,d,n);
        reverseArray(array,0,n);
    }

    private static void reverseArray(int[] array, int start, int end) {
        while(start <= end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
