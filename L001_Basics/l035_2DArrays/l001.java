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

    // (i_1,j_1) -> cell_1, (i_2,j_2) -> cell_2
    public static void swap2D(int[][] arr, int i_1, int j_1, int i_2, int j_2) {
        int temp = arr[i_2][j_2];
        arr[i_2][j_2] = arr[i_1][j_1];
        arr[i_1][j_1] = temp;
    }

    // matrix always be a square matrix
    public static void transpose(int[][] matrix) {
        int n = matrix.length, m = n;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < m; j++) {
                swap2D(matrix, i, j, j, i);
            }
        }
    }

    // T: O(N), where N is no of rows
    public static void swapColumn(int[][] arr, int c1, int c2) {

    }

    // T: O(??)
    public static void swapRow(int[][] arr, int r1, int r2) {

    }

    public static void main(String[] args) {
        int[][] arr = input2d();
        print2D(arr);
        transpose(arr);
        print2D(arr);
    }
}