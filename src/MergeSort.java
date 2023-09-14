import java.util.*;
public class MergeSort {
    public static void mergeSort(int[] arr, int start, int end){
        if(start >= end) return;
        int mid = start + (end - start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }
    public static void merge(int[] arr, int start, int mid, int end) {
        int[] mergeArr = new int[end - start + 1];
        int idx1 = start, idx2 = mid + 1;
        int x = 0;
        while(idx1 <= mid && idx2 <= end) {
            if(arr[idx1] <= arr[idx2]) {
                mergeArr[x++] = arr[idx1++];
            } else {
                mergeArr[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            mergeArr[x++] = arr[idx1++];
        }
        while(idx2 <= end) {
            mergeArr[x++] = arr[idx2++];
        }
        for(int i=0, j=start; i < mergeArr.length; i++, j++) {
            arr[j] = mergeArr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 8, 9, 2, 1, 7, 3, 1};
        int len = arr.length;
        mergeSort(arr, 0, len - 1);
        System.out.println(Arrays.toString(arr));

    }
}
