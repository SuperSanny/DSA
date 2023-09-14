import java.util.*;
public class SelectionSort {

    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            int idx = i;
            for(int j=i+1; j<n; j++) {
                if(arr[j] < arr[idx]){
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 8, 9, 2, 1, 7, 3, 1};
        int len = arr.length;
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
