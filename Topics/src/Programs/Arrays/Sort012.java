package Programs.Arrays;

import java.util.Arrays;

public class Sort012 {

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0,2 };
        int arr_size = arr.length;
        sort012(arr, arr_size);
    }

    private static void sort012(int[] arr, int arrSize) {
        int count0=0;
        int count1=0;
        int count2=0;

        for( int i =0; i< arr.length; i++){
            if(arr[i] == 0){
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            }else if(arr[i] == 2){
                count2++;
            }
        }
        System.out.println("Total number of 0 is"+count0);
        System.out.println("Total number of 1 is"+count1);
        System.out.println("Total number of 2 is"+count2);
        for(int i=0; i < count0; i++){
            arr[i] = 0;
        }

        for(int i=count0 ; i < count0+count1; i++){
            arr[i] =1;
        }

        for(int i=count0+count1 ; i < arr.length; i++){
            arr[i] =2;
        }

        Arrays.stream(arr).forEach(System.out::print);
    }

}
