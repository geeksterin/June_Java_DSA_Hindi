import java.util.*;

public class l001 {

    public static Scanner scn = new Scanner(System.in);

    public static boolean find(int[][] arr, int data) {

    }

    public static int maximum(int[][] arr) {

    }

    public static int minimum(int[][] arr) {

    }

    public static int sumOfAllElements(int[][] arr) {

    }

    public static void input2d(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt(), m = scn.nextInt();
        int[][] arr = new int[n][m];
        input2d(arr);

        System.out.println(find(arr, scn.nextInt()));
        System.out.println(maximum(arr));
        System.out.println(minimum(arr));
        System.out.println(sumOfAllElements(arr));
    }

}