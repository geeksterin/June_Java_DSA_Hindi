import java.util.*;

public class l001Question {
    // O(N+M)
    public static int[] mergeTwoSortedArrays(int[] A, int[] B) {
        int n = A.length, m = B.length;
        if (n == 0 || m == 0)
            return n != 0 ? A : B;

        int len = n + m;
        int[] ans = new int[len];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (A[i] <= B[j]) {
                ans[k++] = A[i++];
            } else {
                ans[k++] = B[j++];
            }
        }

        while (i < n) {
            ans[k++] = A[i++];
        }

        while (j < m) {
            ans[k++] = B[j++];
        }

        return ans;

    }

    public static void print(int[] arr) {
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();
    }

    // O(N+M)
    public static void intersectionOfTwoSortedArrays(int[] A, int[] B) {
        int n = A.length, m = B.length;
        if (n == 0 || m == 0)
            return;

        int i = 0, j = 0;
        while (i < n && j < m) {
            if (A[i] == B[j]) {
                System.out.println(A[i]);
                i++;
                j++;
            } else if (A[i] < B[j]) {
                i++;
            } else {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] A = { -5, -4, -1, 0, 1, 2, 3, 4, 5, 66, 78, 90, 100 };
        int[] B = { 2, 5, 7, 7 };

        int[] ans = mergeTwoSortedArrays(A, B);
        print(ans);
    }

}