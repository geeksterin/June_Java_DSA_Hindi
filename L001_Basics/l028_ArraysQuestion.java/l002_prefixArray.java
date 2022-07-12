import java.util.*;

public class l002_prefixArray {
    private static Scanner scn = new Scanner(System.in);

    public static int prefixArray(int[] arr, int tar) {
        
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