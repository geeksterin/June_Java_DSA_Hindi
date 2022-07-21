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
        if (m1.length != m2.length || m1[0].length != m2[0].length)
            return false;

        int n = m1.length, m = m1[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (m1[i][j] != m2[i][j])
                    return false;
            }
        }

        return true;
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