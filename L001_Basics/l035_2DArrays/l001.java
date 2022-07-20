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

    public static void swap2D(int[][] arr, int i1, int j1, int i2, int j2) {

    }

    // matrix always be a square matrix
    public static void transpose(int[][] matrix) {

    }

    public static void main(String[] args) {
        int[][] arr = input2d();

    }
}