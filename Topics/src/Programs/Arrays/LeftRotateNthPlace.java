package Programs.Arrays;

import java.util.Arrays;

public class LeftRotateNthPlace
{

    public static void main(String[] args) {
        int[] array = {9,5,2,4,7,3};
        int n = array.length;
        int rotate = 3;
        rotateNthPlace(array,n,rotate);
        Arrays.stream(array).forEach(System.out::print);
    }

    private static void rotateNthPlace(int[] array, int n, int d) {
        //Get number of iteration to be done
        d = d % n;
        int[] temp = new int[d];
        //Hold the first dth elements in temp array
        for(int i=0; i<d;i++){
            temp[i] = array[i];
        }
        //Shifting all the elements to dth position to left
        for(int i = d; i < n; i++){
            array[i-d] = array[i];
        }
        //Adding the starting n elements that are stored in temp array to the end
        int j = 0;
        for(int i= n-d; i < n; i++){
            array[i] = temp[j];
            j++;
        }
    }
}
