package Programs.Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {9,5,2,4,7,3};
        int n = array.length-1;
        rotateArray(array,n);
        Arrays.stream(array).forEach(System.out::print);
    }

    private static void rotateArray(int[] array, int n) {
        int start = 0;
        int end = n;

        while(start <= end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
