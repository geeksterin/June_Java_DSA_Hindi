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

    public static boolean find(int[][] arr, int data) {
        int n = arr.length, m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == data)
                    return true;
            }
        }
        return false;
    }

    public static int maximum(int[][] arr) {
        int n = arr.length, m = arr[0].length, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max = Math.max(max, arr[i][j]);
            }
        }
        return max;
    }

    public static int minimum(int[][] arr) {
        int n = arr.length, m = arr[0].length, min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                min = Math.min(min, arr[i][j]);
            }
        }
        return min;
    }

    public static int sumOfAllElements(int[][] arr) {
        int n = arr.length, m = arr[0].length, sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
            }
        }
        return sum;

    }

    // T: min(n,m)
    public static void printDiagonal(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int i = 0, j = 0;
        while (i < n && j < m) {
            System.out.println(matrix[i][j] + " ");
            i++;
            j++;
        }
    }

    // two matrix of same dimension
    // m1 += m2;
    public static void addTwoMatrix(int[][] m1, int[][] m2) {

    }

    // two matrix of same dimension
    // m1 -= m2;
    public static void subtractTwoMatrix(int[][] m1, int[][] m2) {

    }

    public static void twoMatrixQuestions() {
        int[][] m1 = input2d();
        int[][] m2 = input2d();

        addTwoMatrix(m1, m2);
        print2D(m1);
    }

    public static void main(String[] args) {
        // int[][] arr = input2d();
        // System.out.println(find(arr, scn.nextInt()));
        // System.out.println(maximum(arr));
        // System.out.println(minimum(arr));
        // System.out.println(sumOfAllElements(arr));

    }

}