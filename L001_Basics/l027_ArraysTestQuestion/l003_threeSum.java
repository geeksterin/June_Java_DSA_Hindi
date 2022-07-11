import java.util.*;

public class l003_threeSum {
    private static Scanner scn = new Scanner(System.in);

    // O(N)
    public static void twoSum(int[] arr, int tar, int lb, int rb, int firstNumber) {
        while (lb < rb) {
            int sum = arr[lb] + arr[rb];
            if (sum == tar) {
                System.out.println(firstNumber + " + " + arr[lb++] + " + " + arr[rb--]);
            } else if (sum < tar) {
                lb++;
            } else {
                rb--;
            }
        }
    }

    // O(N2)
    public static void threeSum(int[] arr, int tar) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            twoSum(arr, tar - arr[i], i + 1, n - 1, arr[i]);
        }
    }

    public static void print(int[] arr) {
        for (int ele : arr)
            System.out.print(ele + " ");

        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr = { 10, 3, 4, 0, 0, 0, 0, 4, 5, 6, 0, 7, 0, 1, 0, 3, 0, 5, 67, 0 };

    }
}