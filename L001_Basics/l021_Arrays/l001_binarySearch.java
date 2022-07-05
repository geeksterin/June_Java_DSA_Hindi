import java.util.*;

public class l001_binarySearch {

    private static Scanner scn = new Scanner(System.in);

    public static int binarySearch(int[] arr, int data) {
        int n = arr.length, si = 0, ei = n - 1;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == data) {
                return mid;
            } else if (arr[mid] < data) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }

        return -1;
    }

    // Time: O(n)
    public static int linearSearch(int[] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data)
                return i;
        }

        return -1;
    }

    public static void pairSum(int[] arr, int target) {
        int si = 0, ei = arr.length - 1;
        while (si < ei) {
            int sum = arr[si] + arr[ei];
            if (sum == target) {
                System.out.print(arr[si] + ", " + arr[ei]);
                si++;
                ei--;
            } else if (sum < target) {
                si++;
            } else {
                ei--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { -200, -190, -180, 0, 7, 15, 25, 150, 250, 450, 700, 3750 };
        int ans = binarySearch(arr, scn.nextInt());
        System.out.println(ans);
    }

}