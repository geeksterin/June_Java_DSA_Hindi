import java.util.*;

public class l001 {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortEvenOdd(int[] arr) {
        int n = arr.length, p = -1, itr = 0;
        while (itr < n) {
            if (arr[itr] % 2 == 0) {
                swap(arr, itr, ++p);
            }
            itr++;
        }
    }

    public static int pivotIndex(int[] arr, int data) {
        int n = arr.length, p = -1, itr = 0;
        int idx = n - 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == data) {
                idx = i;
                break;
            }
        }
        swap(arr, idx, n - 1);

        while (itr < n) {
            if (arr[itr] <= data) {
                swap(arr, itr, ++p);
            }
            itr++;
        }

        return p;
    }

    public static void main(String[] args) {

    }

}