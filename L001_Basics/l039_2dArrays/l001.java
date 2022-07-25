import java.util.*;

public class l001 {
    public static Scanner scn = new Scanner(System.in);

    public static int[][] input2d() {
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        return arr;
    }

    public static void print(int[] arr) {
        for (int ele : arr)
            System.out.print(ele + " ");

        System.out.println();
    }

    public static void print2D(int[][] arr) {
        for (int[] ar : arr)
            print(ar);

        System.out.println();
    }

    public static int[][] matrixMultiplication(int[][] A, int[][] B) {
        int n = A.length, m = A[0].length, p = B.length, q = B[0].length;
        if (m != p)
            return null;

        int[][] ans = new int[n][q];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                int res = 0;
                for (int k = 0; k < m; k++) {
                    res += A[][] * B[][];
                }
                ans[i][j] = res;
            }
        }

        return ans;
    }

    public static void matrixMultiplication() {
        int[][] A = input2d();
        int[][] B = input2d();

        int[][] ans = matrixMultiplication(A, B);
        if (ans != null)
            print2D(ans);
        else
            System.out.println("Matrix Multiplication is not fesible: " + -1);
    }

    public static void main(String[] args) {
        matrixMultiplication();
    }
}