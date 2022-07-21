import java.util.*;

public class l002_sameMatrix {

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

    public static boolean sameMatrix(int[][] m1, int[][] m2) {

    }

    public static void main(String[] args) {
        int[][] m1 = input2d();
        int[][] m2 = input2d();
        System.out.println(sameMatrix(m1, m2));
    }
/*
 * 3 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 3 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 */
}