package Programs.Arrays;

import java.util.Arrays;

public class Shift0sToRight {
    public static void main(String[] args) {
        int[] array = {9,0,2,0,5,6,89,0,44,7,0};
        shiftToRight(array);
        Arrays.stream(array).forEach(System.out::print);
    }

    private static void shiftToRight(int[] array) {

        int count = 0;
        //Get All Non-Zero elements in an Array first.
        int[] temp;
        for(int i =0; i< array.length-1;i++){
            if(array[i] != 0){
                array[count] = array[i];
                count++;
            }
        }

        // Adding zero at the remaining places
        for(int i= count; i< array.length-1;i++){
            array[i] = 0;
        }

    }
}
