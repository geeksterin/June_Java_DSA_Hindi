import java.util.*;

public class l001_questions {
    public static Scanner scn = new Scanner(System.in);

    public static int getMaximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int ele : arr) {
            // max = ele > max ? ele : max;
            max = Math.max(ele, max);
        }
        return max;
    }

    public static int getMinimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int ele : arr) {
            // min = ele < min ? ele : min;
            min = Math.min(ele, min);
        }
        return min;
    }

    // O(2*N): two traveral method
    public static int findDiffrence_01(int[] arr) {
        int max = getMaximum(arr);
        int min = getMinimum(arr);

        return max - min;
    }

    // O(1*N): one traveral method
    public static int findDiffrence_02(int[] arr) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int ele : arr) {
            max = Math.max(max, ele);
            min = Math.min(min, ele);
        }

        // for(int i = 0; i < arr.length;i++){
        // max = Math.max(max, arr[i]);
        // min = Math.min(min, arr[i]);
        // }

        return max - min;
    }

    public static int countPeakEle(int[] arr) {
        if (arr.length < 3)
            return 0;

        int n = arr.length, count = 0;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                count++;
            }
        }
        return count;
    }

    public static boolean checkIncreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i])
                return false;
        }

        return true;
    }

    public static boolean checkDecreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i])
                return false;
        }

        return true;
    }

    // Leetcode 852
    public int peakIndexInMountainArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i])
                return i - 1;
        }

        return arr.length - 1;
    }

    // HW
    public static boolean checkMountain(int[] arr) {
        return false;
    }

    public static boolean checkArrayisIncreasingSorted(int[] arr) {
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 67, 23, 34, 123, 4, 5, 6, 7, 8, 9, 20 };
        System.out.println(findDiffrence_01(arr));
        System.out.println(findDiffrence_02(arr));
    }

}