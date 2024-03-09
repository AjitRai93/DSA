package Programs;

public class BinarySearch {

public static int findNumberUsingBinarySearch(int[] arr,int target){
    int left=0;
    int right = arr.length-1;

    while (left<=right){
        int mid = left + (right-left)/2;
        if(target == arr[mid]){
            return arr[mid];
        }
        else if(target <= arr[mid]){
            right = mid -1;
        }else {
            left = mid +1;
        }
    }
    return -1;
}
    public static void main(String[] args) {
        int[] array = {1,2,4,5,8,9};
        System.out.println("The number is:"+findNumberUsingBinarySearch(array,2));

    }
}
