package Programs.Arrays;

import java.util.Arrays;

public class LeftRotateArrayOnePlace {

    public static void main(String[] args) {
        int[] array = {9,5,2,4,7,3};
        int n = array.length;
        leftRotateOnePlace(array,n);
        Arrays.stream(array).forEach(System.out::print);
    }

    private static void leftRotateOnePlace(int[] array, int n) {
        int temp = array[0];
        for(int i=1; i < array.length ;i++){
            array[i-1] = array[i];
        }
        array[n-1] = temp;
    }
}
