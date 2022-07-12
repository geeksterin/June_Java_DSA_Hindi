import java.util.*;

public class l001_rotateArray {
    private static Scanner scn = new Scanner(System.in);

    public static void rotateArray_basic(int[] arr, int k) {
        int n = arr.length;
        k %= n; // k comes under range of n [0, n - 1]

        int idx = len - k;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[idx % n] = arr[i];
            idx++;
        }

        // copy
        for (int i = 0; i < n; i++)
            arr[i] = ans[i];
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseInRange(int[] arr, int lb, int rb) {
        while (lb < rb) {
            swap(arr, lb++, rb--);
        }
    }

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        if (k < 0)
            K += n;

        reverseInRange(arr, 0, k - 1);
        reverseInRange(arr, k, n - 1);
        reverseInRange(arr, 0, n - 1);
    }

    public static void print(int[] arr) {
        for (int ele : arr)
            System.out.print(ele + " ");

        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 8, 9, 7, 10, 12, 13, 16, 17, 22 };
        int tar = 30;
        threeSum(arr, tar);
    }
}