import java.util.*;

public class l001_basic {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void segregate0and1(int[] arr, int n) {
        int pt = -1, itr = 0;
        while (itr < n) {
            if (arr[itr] == 0) {
                swap(arr, itr, ++pt);
            }
            itr++;
        }
    }

    public void sortColors(int[] arr) {
        int n = arr.length, pt1 = -1, itr = 0, pt2 = n - 1;
        while (itr <= pt2) {
            if (arr[itr] == 0) {
                swap(arr, itr++, ++pt1);
            } else if (arr[itr] == 1) {
                itr++;
            } else if (arr[itr] == 2) {
                swap(arr, itr, pt2--);
            }
        }
    }

    public static void main(String[] args) {

    }
}