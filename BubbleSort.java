import java.util.*;

public class BubbleSort {
    public static void bubbleSort(int[] arr, int size){
        int temp = 0;

        for(int i = 0; i < size; i++){
            for(int j = 1; j < (size-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int arr[] = {15, 9, 8, 12, 10, 3, 6, 1, 4, 7};

        System.out.println("Array pre-sort: " + Arrays.toString(arr));
        bubbleSort(arr, 10);
        System.out.println("Array post-sort: " + Arrays.toString(arr));
    }
}
