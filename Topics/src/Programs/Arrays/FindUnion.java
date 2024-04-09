package Programs.Arrays;

import java.util.HashSet;

public class FindUnion {
    public static void main(String[] args) {
        int[] array1 = {9,5,2,4,7,3};
        int[] array2 = {1,5,6,4,7,3};
        HashSet union = findUnion(array1, array2);
        union.stream().forEach(System.out::print);
    }

    private static HashSet findUnion(int[] array1, int[] array2) {
        HashSet set = new HashSet();
        for (int j=0; j < array1.length-1;j++) {
            set.add(array1[j]);
        }
        for(int j=0; j < array2.length-1;j++){
            set.add(array2[j]);
        }

        return set;
    }
}
