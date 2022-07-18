import java.util.*;

public class l001 {

    public static Scanner scn = new Scanner(System.in);

    public static void test() {
        // int[][] arr = new int[4][3];
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i][3]);
        // }

        int[][] arr1 = { { 10, 11, 12 }, { 13, 15 }, { 32, 23, 45, 45, 65, 8 } };
        for (int r = 0; r < arr1.length; r++) {
            for (int c = 0; c < arr1[r].length; c++) {
                System.out.print(arr1[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] arr2 = { { 1, 2, 3, 4 }, { 11, 12, 13, 14 }, { 21, 22, 23, 24 } };
        int n = arr2.length, m = arr2[0].length; // it is valid only for rectangle matrix
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                System.out.print(arr2[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static void print1D(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void print2D(int[][] arr) {
        // int n = arr.length, m = arr[0].length;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        for (int[] ar : arr) {
            print1D(ar);
        }

    }

    public static void input2D(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void print4D(int[][][][] arr) {

    }

    public static void input4D(int[][][][] arr) {

    }

    public static void main(String[] args) {
        int n = scn.nextInt(), m = scn.nextInt();
        int[][] arr = new int[n][m];
        input2D(arr);
        print2D(arr);
        test();

        int[][][][] arr1 = new int[scn.nextInt()][scn.nextInt()][scn.nextInt()][scn.nextInt()];
        input4D(arr1);
        print4D(arr1);
    }
}