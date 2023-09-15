import java.util.*;
public class InsertionSort {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        if(n <= 1) return;
        for(int i = 1; i < n; i++){
            int step = arr[i];
            int j = i-1;
            while(j >= 0 && step < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = step;
        }
    }
    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 4, 1, 6};
        int len = arr.length;
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
