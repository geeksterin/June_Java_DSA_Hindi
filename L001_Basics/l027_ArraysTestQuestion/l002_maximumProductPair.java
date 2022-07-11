import java.util.*;

public class l002_maximumProductPair {
    private static Scanner scn = new Scanner(System.in);

    // O(1)
    public static int maximumPairProduct(int[] arr, int lb, int rb) {
        if (rb - lb + 1 < 2)
            return Integer.MIN_VALUE;

        int num1 = arr[rb] * arr[rb - 1];
        int num2 = arr[lb] * arr[lb + 1];

        return Math.max(num1, num2);
    }

    // If bubble sort is applied then O(N2 + N) = O(N2)
    public static int maximumTriplet(int[] arr) {
        int maximumAns = Integer.MIN_VALUE;
        Arrays.sort(arr); // you will apply Bubble Sort

        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            int num = arr[i];
            int maximumPair = maximumPairProduct(arr, 0, i - 1);

            maximumAns = Math.max(maximumAns, maximumPair * num);
        }

        return maximumAns;
    }

    public static void print(int[] arr) {
        for (int ele : arr)
            System.out.print(ele + " ");

        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr = { 10, 3, 4, 0, 0, 0, 0, 4, 5, 6, 0, 7, 0, 1, 0, 3, 0, 5, 67, 0 };
        maximumTriplet(arr);

    }
}