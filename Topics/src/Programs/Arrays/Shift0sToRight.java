package Programs.Arrays;

public class Shift0sToRight {
    public static void main(String[] args) {
        int[] array = {9,0,2,0,5,6,89,0,44,7,0};
        shiftToRight(array);
    }

    private static void shiftToRight(int[] array) {

        int count = 0;
        for(int i =0; i< array.length-1;i++){
            if(array[i] != 0){
                array[i] = array[i];
            }
        }

    }
}
