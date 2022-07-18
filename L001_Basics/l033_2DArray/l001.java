public class l001 {

    public static void test() {
        // int[][] arr = new int[4][3];
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i][3]);
        // }

        int[][] arr1 = { { 10, 11, 12 }, { 13, 15 }, { 32, 23, 45, 45, 65, 8 } };

        int[][] arr2 = { { 1, 2, 3, 4 }, { 11, 12, 13, 14 }, { 21, 22, 23, 24 } };

        int n = ??, m = ??;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                System.out.print(arr2[r][c] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        test();
    }
}