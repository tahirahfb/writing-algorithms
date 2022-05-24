import java.util.*;

public class QuickSort {
    int partition(int[] arr, int low, int high){
        int pivot = arr[high]; //pivot element
        int i = (low -1);

        for(int j = low; j <= high - 1; j++ ){
            //if current element is smaller than the pivot
            if(arr[j] < pivot){
                i++; //increment index of smaller element
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return (i + 1);
    }

    void quickSort(int[] arr, int low, int high){
        if(low < high){
            int par = partition(arr, low, high); //par is partitioning index
            quickSort(arr, low, par -1);
            quickSort(arr, par + 1, high);
        }
    }

    public static void main(String args[]){
        int[] arr = {22, 17, 1, 5, 9, 7, 3, 25, 1, 42, 58};
        int high = arr.length;

        System.out.println("Array pre-sort: " + Arrays.toString(arr));
        QuickSort q1 = new QuickSort(); //New instance (object)
        q1.quickSort(arr, 0, high -1);
        System.out.println("Array post-sort: " + Arrays.toString(arr));
    }
}
