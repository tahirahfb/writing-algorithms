import java.util.*;
public class CountingSort {
    void countSort(char[] arr){
        int len = arr.length;

        //The output character array that will have sorted arr
        char output[] = new char[len];

        /*Create a count array to store count of individual
        characters and initialize count array as 0
        */

        int count[] = new int[256];
        for(int i = 0; i < 256; ++i)
        count[i] = 0;

        //Store count of each character
        for(int i = 0; i < len; ++i){
            ++count[arr[i]];
        }

        /*Change count[i] so that count[i] now contains actual
        position of this character in output array
        */

        for(int i = 1; i < 255; ++i)
        count[i] += count[i -1];

        //Build the output character array
        for(int i = 0; i < len; ++i){
            output[count[arr[i]] -1] = arr[i];
            --count[arr[i]];
        }

        /*Copy the output array to arr, so that arr now contains sorted characters*/
        for(int i =0; i < len; ++i){
            arr[i] = output[i];
        }
    }
    public static void main(String args[]){
        CountingSort ob = new CountingSort();
        char arr[] = {'z', 'y', 'a', 'x', 'b', 'd', 'c', 'p', 'f', 'o', 'e', 'h', 'i', 'm'};
        System.out.println("Array pre-sort: " + Arrays.toString(arr));
        ob.countSort(arr);
        System.out.println("Array post-sort: " + Arrays.toString(arr));
    }
}
